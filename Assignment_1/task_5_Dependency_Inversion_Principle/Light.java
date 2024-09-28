package Assignment_1.task_5_Dependency_Inversion_Principle;

public class Light implements Switchable{
    @Override
    public void turnOn(){
        System.out.println("Light is ON.");
    }
    @Override
    public void turnOff(){
        System.out.println("Light is OFF.");
    }
}
