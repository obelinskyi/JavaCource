package advanced_java.c06_multithreading.synchronization;

public class ATM {

    static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if ((balance - amount) < - account.getOverdraft()) {
            System.out.println("Operation is denied!");
        } else {
            account.debit(amount);
            System.out.println(String.format("$%d is successfully withdrawn", amount));
        }
        System.out.println(String.format("Current balance is $%d", account.getBalance()));
    }
}
