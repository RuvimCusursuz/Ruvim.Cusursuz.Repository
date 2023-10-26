package bonus_hm_1;

public class WithDrawalTransaction implements Transaction {
    private BankAccaunt bankAccaunt;
    private Integer money;

    public WithDrawalTransaction(BankAccaunt bankAccaunt, Integer money) {
        this.bankAccaunt = bankAccaunt;
        this.money = money;
    }

    @Override
    public void procces() {
        bankAccaunt.takeMoneyFromAccount(money);
    }
}
