package codeclinic.pondoreille;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BPTrend {

    private static String dateFormat = "yyyy_MM_dd HH:mm:ss";
    private String dirPath = "src/codeclinic/pondoreille/CH01";
    private String[] files = {"Environmental_Data_Deep_Moor_2012.txt",
            "Environmental_Data_Deep_Moor_2013.txt",
            "Environmental_Data_Deep_Moor_2014.txt",
            "Environmental_Data_Deep_Moor_2015.txt"};
    private static List<WeatherEntry> collectedData = new ArrayList<>();

    synchronized void readData(String fileName) throws IOException, ParseException {
        System.out.println(Thread.currentThread().getName());
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        File file = new File(fileName);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String currentLine;
            boolean firstLine = true;
            String[] splitedLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                splitedLine = currentLine.split("\t");
                collectedData.add(
                        new WeatherEntry(format.parse(splitedLine[0]), Float.valueOf((splitedLine[2]))));
            }

        }
    }

    void doCalc(Date from, Date end) {
        List<WeatherEntry> filteredEntries = collectedData.stream()
                .filter((weatherEntry -> weatherEntry.date.after(from) && weatherEntry.date.before(end)))
                .sorted()
                .collect(Collectors.toList());
        for (WeatherEntry entry : filteredEntries) {
            System.out.println(entry);
        }
        System.out.println(filteredEntries.size());
    }

    public static void main(String[] args) {
        BPTrend bp = new BPTrend();
        for (String fileName : bp.files) {
            new Thread(() -> {
                try {
                    bp.readData(bp.dirPath + "/" + fileName);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }).start();
//            bp.readData(bp.dirPath + "/" + fileName);
        }

        SimpleDateFormat format = new SimpleDateFormat(dateFormat);

        try {
            bp.doCalc(format.parse("2012_09_02 20:54:46"), format.parse("2012_09_03 00:21:24"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
