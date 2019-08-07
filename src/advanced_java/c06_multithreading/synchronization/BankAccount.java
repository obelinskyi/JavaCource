package advanced_java.c06_multithreading.synchronization;

public class BankAccount {
    private int balance = 0;
    private final int overdraft;

    public BankAccount(int overdraft) {
        this.overdraft = overdraft;
    }

    void topUp(int amount) {
        this.balance += amount;
    }

    void debit(int amount) {
        this.balance -= amount;
    }

    int getBalance() {
        return this.balance;
    }

    public int getOverdraft() {
        return overdraft;
    }
}
