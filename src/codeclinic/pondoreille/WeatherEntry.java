package codeclinic.pondoreille;

import java.util.Date;

public class WeatherEntry {
    Date date;
    private float barometricPress;

    WeatherEntry(Date date, float barometricPress) {
        this.date = date;
        this.barometricPress = barometricPress;
    }

    @Override
    public String toString() {
        return "WeatherEntry{" +
                "date=" + date +
                ", barometricPress=" + barometricPress +
                '}';
    }
}
