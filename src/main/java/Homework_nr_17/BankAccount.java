package Homework_nr_17;

public class BankAccount {
    private final String accountHolder;

    private String accountNumber;
    private Double accountBalance;

    private static Integer accountCount = 0;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountBalance = 0d;
        this.accountNumber = accountNumber;
        this.accountCount++;
    }
    public BankAccount(String accountHolder, String accountNumber, Double accountBalance) {
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.accountCount++;
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public static Integer getAccountCount() {
        return accountCount;
    }

    public void  setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
