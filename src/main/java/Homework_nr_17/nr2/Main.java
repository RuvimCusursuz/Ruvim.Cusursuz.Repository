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

        long before = System.currentTimeMillis();

        Thread T = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("T");
                while(!(transferBank.bankAccountSearch("Olga").getAccountBalance() == 2000)) {
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
                while(!(transferBank.bankAccountSearch("Ella").getAccountBalance() == 2000)) {
                    try {
                        transferBank.transfer("Olga", "Ella", 200);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("T2");
                while(!(transferBank.bankAccountSearch("Ruvim").getAccountBalance() == 2000)) {
                    try {
                        transferBank.transfer("Ella", "Ruvim", 200);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        T.start();
        T1.start();
        T2.start();

        T.join();
        T1.join();
        T2.join();

        transferBank.printAllAccounts();
        long after = System.currentTimeMillis();

        System.out.println("Process took " +(after-before) + " ms");


    }
}


