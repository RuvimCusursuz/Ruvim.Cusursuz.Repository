package bonus_hm_1;

public class Main {
    public static void main(String[] args) {
        Bank.generateBankAccount(123456789, "Ruvim Cusursuz", 20.0);
        Bank.generateBankAccount(987654321, "Ella Cusursuz", 20.0);
        Bank.showAllAccount();
        Bank.putMoneyOnAccount("Ella Cusursuz", 150);
        Bank.getMoneyFromAccount("Ruvim Cusursuz", 10);
        Bank.showAllAccount();

        Bank.getMoneyFromAccount("Ruvim Cusursuz", 250);

        Bank.showAccountBalance("Ruvim Cusursuz");
    }
}
