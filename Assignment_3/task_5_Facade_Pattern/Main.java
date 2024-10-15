package Assignment_3.task_5_Facade_Pattern;

public class Main {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();
        bankFacade.performBankOperations(); // Simplified access to banking operations
    }
}
