package bonus_hm_1;

public class BankAccaunt {
    private Integer accountNumber;
    private String nameOfMan;
    private Integer accountBalance;

    static private Integer countOfBankAccount = 0;

    public BankAccaunt(Integer accountNumber, String nameOfMan, Integer accountBalance) {
        this.accountNumber = accountNumber;
        this.nameOfMan = nameOfMan;
        this.accountBalance = accountBalance;
        countOfBankAccount++;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getNameOfMan() {
        return nameOfMan;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void putMoneyOnAccount(Integer money) {
        this.accountBalance += money;
    }
    public void takeMoneyFromAccount(Integer money){
        if(this.accountBalance - money >= 0){
            this.accountBalance-= money;
        }
        else {
            System.out.println("not enough money on account");
        }
    }

}
