package Homework_nr_17.nr2;

import Homework_nr_17.Constans;
import Homework_nr_17.BankAccount;
import bonus_hm_2.tasks.Exception.InvalidNameOrDiscription;

import java.util.ArrayList;
import java.util.List;

public class BankSyn {
    private String bankName;
    private List<BankAccount> bankAccounts;

    public BankSyn(String bankName) {
        this.bankName = bankName;
        this.bankAccounts = new ArrayList<>();
    }

    public void createBankAccount(String accountHolder) throws InvalidNameOrDiscription {
        for (int i = 0; i < accountHolder.length(); i++) {
            if (Character.isDigit((accountHolder.charAt(i)))) {
                throw new InvalidNameOrDiscription("Names and descriptions can contain only letter");
            }
        }
        char[] number = accountHolder.toCharArray();
        StringBuilder accountNumber = new StringBuilder(BankAccount.getAccountCount().toString());
        for (char c : number) {
            while (accountNumber.length() < 12) {
                accountNumber.append(c);
            }
        }
        bankAccounts.add(new BankAccount(accountHolder, accountNumber.toString(), 800d));
    }

    public void deposit(double amount, String name) {
        bankAccountSearch(name).setAccountBalance(amount + bankAccountSearch(name).getAccountBalance());

    }

    public void withdraw(double amount, String name) throws InterruptedException {
        while (bankAccountSearch(name).getAccountBalance() < amount) {
            try {
                if (bankAccountSearch(name).getAccountBalance() < amount) {
                    throw new RuntimeException("недостаточно денег на счете");
                }
            } catch (RuntimeException e) {
                System.out.println(Constans.ANSI_RED + "don`t enought money");

            }
        }
        bankAccountSearch(name).setAccountBalance(bankAccountSearch(name).getAccountBalance() - amount);
    }

    public void transfer(String nameSender, String nameGetter, double amount) throws Exception {
        synchronized (this) {
            withdraw(amount, nameSender);
            deposit(amount, nameGetter);
        }
        String color = "";
        switch (Thread.currentThread().getName()) {
            case "T":
                color = Constans.ANSI_RED;
                break;
            case "T1":
                color = Constans.ANSI_GREEN;
                break;
            default:
                throw new Exception("ThreadName invaled");
        }
        System.out.println(color + nameSender + bankAccountSearch(nameSender).getAccountBalance());
        System.out.println(color + nameGetter + bankAccountSearch(nameGetter).getAccountBalance());
    }

    public void printAllAccounts() {
        for (BankAccount b : bankAccounts
        ) {
            System.out.println(b);
        }
    }

    public BankAccount bankAccountSearch(String name) {
        for (BankAccount b : bankAccounts
        ) {
            if (b.getAccountHolder().equals(name)) {
                return b;
            }
        }
        return null;
    }
}
