package Assignment_3.task_1_Adapter_Pattern;

public class Main {
    public static void main(String[] args) {
        LegacyOrderProcessor legacyOrderProcessor = new LegacyOrderProcessor();
        NewOrderProcessor newOrderProcessor = new OrderAdapter(legacyOrderProcessor);
        newOrderProcessor.processNewOrder();
    }
}
