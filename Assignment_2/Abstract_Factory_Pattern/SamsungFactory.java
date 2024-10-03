package Assignment_2.Abstract_Factory_Pattern;

public class SamsungFactory implements DeviceFactory{
    @Override
    public Smartphone createSmartphone() {
        return new SamsungSmartphone();
    }

    @Override
    public Laptop createlaptop() {
        return new SamsungLaptop();
    }
}
