package Assignment_3.task_1_Adapter_Pattern;

public class OrderAdapter implements NewOrderProcessor{

    private LegacyOrderProcessor legacyOrderProcessor;
    OrderAdapter(LegacyOrderProcessor legacyOrderProcessor) {
        this.legacyOrderProcessor = legacyOrderProcessor;
    }

    @Override
    public void processNewOrder() {
        legacyOrderProcessor.processLegacyOrder();
    }

}
