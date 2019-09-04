package designpatterns.creationalpatterns.c03_singleton;

public class PrintSpooler {
    private static final PrintSpooler instance = new PrintSpooler();
    private static boolean initialized = false;

    private PrintSpooler() {}

    public static synchronized PrintSpooler getInstance(){
        if (!initialized) {
            initialized = true;
        }
        return instance;
    }

}
