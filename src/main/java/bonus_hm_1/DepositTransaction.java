package bonus_hm_1;

public class DepositTransaction implements Transaction{
    private BankAccaunt bankAccaunt;
    private Integer money;

    public DepositTransaction(BankAccaunt bankAccaunt, Integer money) {
        this.bankAccaunt = bankAccaunt;
        this.money = money;
    }

    @Override
    public void procces() {
        bankAccaunt.putMoneyOnAccount(money);
    }
}
