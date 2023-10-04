package bonus_hm_1;

import java.util.ArrayList;

public class Bank {
    static ArrayList<BankAccaunt> bankAccauntArrayList = new ArrayList<>();

    public static void generateBankAccount( Integer accountNumber, String nameOfman, Double accountBalance){
        BankAccaunt account = new BankAccaunt(accountNumber, nameOfman,accountBalance);
        bankAccauntArrayList.add(account);
    }

    public static void putMoneyOnAccount( String name, Integer money){
        for(BankAccaunt b : bankAccauntArrayList){
            if(b.getNameOfMan().equals(name)){
                DepositTransaction x = new DepositTransaction(b, money);
                x.procces();
            }
        }
    }

    public static void getMoneyFromAccount(String name, Integer money){
        for(BankAccaunt b : bankAccauntArrayList){
            if(b.getNameOfMan().equals(name)){
                WithDrawalTransaction x = new WithDrawalTransaction(b, money);
                x.procces();
            }
        }
    }
    public static void showAccountBalance(String name){
        for(BankAccaunt b : bankAccauntArrayList){
            if(b.getNameOfMan().equals(name)){
                System.out.println(b.getNameOfMan() + " has " + b.getAccountBalance());
            }
        }
    }

    public static void showAllAccount(){
        System.out.println("we have " + BankAccaunt.getCountOfBankAccount() + " accounts");
        for (BankAccaunt a : bankAccauntArrayList){
            System.out.println(a.getAccountNumber() + " = " + a.getAccountBalance());
        }
    }


}
