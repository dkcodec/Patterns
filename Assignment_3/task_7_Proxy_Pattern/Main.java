package Assignment_3.task_7_Proxy_Pattern;

public class Main {
    public static void main(String[] args) {
        BankAccount authorizedAccount = new BankAccountProxy("authorizedUser");
        authorizedAccount.accessAccount(); // Access granted
        BankAccount unauthorizedAccount = new BankAccountProxy("unauthorizedUser");
        unauthorizedAccount.accessAccount(); // Access denied
    }
}
