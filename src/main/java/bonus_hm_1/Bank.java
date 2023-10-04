package bonus_hm_1;

import java.util.ArrayList;

public class Bank {
    static ArrayList<BankAccaunt> bankAccauntArrayList;
    public static void generateBankAccount( Integer accountNumber, String nameOfman, Integer accountBalance, String nameOf){
        BankAccaunt nameOf = new BankAccaunt(accountNumber, nameOfman,accountBalance);
        bankAccauntArrayList.add(name);
    }
    public static void putMoneyOnAccount(BankAccaunt account, Integer money){
        account.putMoneyOnAccount(money);
    }
    public static void getMoneyFromAccount(BankAccaunt account, Integer money){
        account.takeMoneyFromAccount(money);
    }
    public static void showAccountBalance(BankAccaunt accaunt){
        System.out.println(accaunt.getAccountBalance());
    }

    public static void showAllAccount(){
        for (BankAccaunt a : bankAccauntArrayList){
            System.out.println(a.getAccountNumber() + " = " + a.getAccountBalance());
        }
    }


}
