package Assignment_3.task_7_Proxy_Pattern;

public class RealBankAccount implements BankAccount{
    private String accountHolder;
    public RealBankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public void accessAccount() {
        System.out.println("Accessing bank account of: " + accountHolder);
    }

}
