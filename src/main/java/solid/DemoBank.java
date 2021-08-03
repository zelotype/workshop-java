package solid;

public class DemoBank {
    public static void main(String[] args) {
        TransferMoneyProcess bankAccount = new LocalBankAccount();
        bankAccount.transferMoney(1000);

        TransferMoneyProcess interBankAccount = new InterBankAccount();
        interBankAccount.transferMoney(2000);
    }
}

interface TransferMoneyProcess {
    void transferMoney(int amount);
}

class LocalBankAccount implements TransferMoneyProcess {
    @Override
    public void transferMoney(int amount) {
        System.out.println("Transfer money in TH only.");
    }
}

class InterBankAccount implements TransferMoneyProcess {
    @Override
    public void transferMoney(int amount) {
        System.out.println("Transfer money (International).");
    }
}
