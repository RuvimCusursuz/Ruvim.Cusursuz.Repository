package Homework_nr_17.nr1;

import Homework_nr_17.BankAccount;
import Homework_nr_17.Constans;
import bonus_hm_2.tasks.Exception.InvalidNameOrDiscription;

public class Main {
    public static void main(String[] args) throws InvalidNameOrDiscription {
        Bank agroBank = new Bank("AgroinBank");
        agroBank.createBankAccount("Ruvim Cusursuz");
        agroBank.createBankAccount("Lodsi Lodsi");
        agroBank.createBankAccount("Valeriu Konstantinov");
        agroBank.createBankAccount("Piotr Ciobanu");
        agroBank.createBankAccount("Olga Cusursuz");
        agroBank.createBankAccount("Oleg Cusursuz");
        agroBank.createBankAccount("Maxim Cusursuz");

        agroBank.deposit(1000, "Ruvim Cusursuz");
        agroBank.deposit(1000,"Lodsi Lodsi");
        agroBank.deposit(1000,"Valeriu Konstantinov");
        agroBank.deposit(1000, "Piotr Ciobanu");
        agroBank.deposit(1000, "Olga Cusursuz");
        agroBank.deposit(1000, "Oleg Cusursuz");
        agroBank.deposit(1000,"Maxim Cusursuz");

        agroBank.printAllAccounts();

        Thread  w1 = new Thread(new BankOperationsWithraw(agroBank, 500));

        Thread d1 = new Thread(new BankOperationsDeposit(agroBank, 350));

        w1.start();
        d1.start();

//        agroBank.printAllAccounts();
    }
}

    class  BankOperationsWithraw implements Runnable{
        private Bank bank;

        private Integer amount;

        public BankOperationsWithraw(Bank bank, Integer amount) {
            this.bank = bank;
            this.amount = amount;
        }

        @Override
        public void run() {
            for (BankAccount b: bank.getBankAccounts()
                 ) {
                this.bank.withdraw(amount, b.getAccountHolder());
                System.out.println(Constans.ANSI_GREEN + b.getAccountHolder() + "= " + bank.getBalance(b.getAccountHolder()));
            }

        }
    }

class  BankOperationsDeposit implements Runnable{
    private Bank bank;

    private Integer amount;

    public BankOperationsDeposit(Bank bank, Integer amount) {
        this.bank = bank;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (BankAccount b: bank.getBankAccounts()
        ) {
            this.bank.deposit(amount, b.getAccountHolder());
            System.out.println(Constans.ANSI_RED + b.getAccountHolder() + "= " + bank.getBalance(b.getAccountHolder()));
        }
    }
}
