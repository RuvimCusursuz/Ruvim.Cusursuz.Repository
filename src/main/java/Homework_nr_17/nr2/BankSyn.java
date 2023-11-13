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
        notifyAll();
    }

    public void withdraw(double amount, String name) throws InterruptedException {
        boolean b = true;
        boolean b1 = true;
        while (b) {
            if (!(b1)) {
                Thread.currentThread().interrupt();
            }
            try {
                if (bankAccountSearch(name).getAccountBalance() < amount) {
                    wait(3000);
                    b1 = false;
                    throw new RuntimeException("недостаточно денег на счете");
                } else {
                    bankAccountSearch(name).setAccountBalance(bankAccountSearch(name).getAccountBalance() - amount);
                    b = false;
                }
            } catch (RuntimeException e) {
                System.out.println("don`t enought money");

            }
        }
    }


    public synchronized void transfer(String nameSender, String nameGetter, double amount) throws Exception {
        withdraw(amount, nameSender);
        deposit(amount, nameGetter);

        String color = "";
        switch (Thread.currentThread().getName()) {
            case "T":
                color = Constans.ANSI_RED;
                break;
            case "T1":
                color = Constans.ANSI_GREEN;
                break;
            case "T2":
                color = Constans.ANSI_BLACK;
                break;
            default:
                throw new Exception("ThreadName invaled");
        }
        System.out.println(color + nameSender + " " + bankAccountSearch(nameSender).getAccountBalance());
        System.out.println(color + nameGetter + " " + bankAccountSearch(nameGetter).getAccountBalance());
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
