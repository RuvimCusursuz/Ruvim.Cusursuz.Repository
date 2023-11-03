package Homework_nr_17;

import bonus_hm_2.tasks.Exception.InvalidNameOrDiscription;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Bank {
    private String bankName;
    private List<BankAccount> bankAccounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankAccounts = new ArrayList<>();
    }

    public void createBankAccount(String accountHolder) throws InvalidNameOrDiscription {
        for (int i = 0; i < accountHolder.length(); i++) {

            if (Character.isDigit((accountHolder.charAt(i)))) {
                throw new InvalidNameOrDiscription("Names and descriptions can contain only letter");
            }
            char[] number = accountHolder.toCharArray();
            StringBuilder accountNumber = new StringBuilder(BankAccount.getAccountCount().toString());
            for (char c : number) {
                while (accountNumber.length() < 12) {
                    accountNumber.append(c);
                }
            }
            bankAccounts.add(new BankAccount(accountHolder, accountNumber.toString()));
        }

    }
    public void deposit(double amount, String name){
        bankAccountSearch(name).setAccountBalance(amount + bankAccountSearch(name).getAccountBalance());
    }

    public void withdraw(double amount, String name){
        if(bankAccountSearch(name).getAccountBalance()<amount){
             throw new RuntimeException("недостаточно денег на счете");
        }
        bankAccountSearch(name).setAccountBalance(bankAccountSearch(name).getAccountBalance() - amount);
    }

    public Double getBalance(String name){
        return bankAccountSearch(name).getAccountBalance();
    }

    private BankAccount bankAccountSearch(String name){

        for (BankAccount b: bankAccounts
             ) {
            if (b.getAccountHolder().equals(name)){
                return b;
            }
        }
        return null;
    }
}
