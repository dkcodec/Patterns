package Assignment_2.Abstract_Factory_Pattern;

public class AppleFactory implements DeviceFactory{
    @Override
    public Smartphone createSmartphone() {
        return new AppleSmartphone();
    }

    @Override
    public Laptop createlaptop() {
        return new AppleLaptop();
    }
}
