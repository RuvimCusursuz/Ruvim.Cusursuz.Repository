package Homework_nr_17.nr2;

import Homework_nr_17.Constans;
import bonus_hm_2.tasks.Exception.InvalidNameOrDiscription;

public class Main {

    public static void main(String[] args) throws Exception {
        BankSyn transferBank = new BankSyn("MAIB");
        transferBank.createBankAccount("Ruvim");
        transferBank.createBankAccount("Olga");
        transferBank.createBankAccount("Ella");

        transferBank.printAllAccounts();
        Thread T = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("T");
                while(!(transferBank.bankAccountSearch("Olga").getAccountBalance() == 1200)) {
                    try {
                        transferBank.transfer("Ruvim", "Olga", 200);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread T1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("T1");
                while(!(transferBank.bankAccountSearch("Ruvim").getAccountBalance() == 1400)) {
                    try {
                        transferBank.transfer("Olga", "Ruvim", 200);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        T.start();
        T1.start();

    }
}


