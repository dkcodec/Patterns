package Assignment_1.task_3_Liskov_Substitution_Principle;

public class Sparrow extends Bird implements Flyable{
    public void fly() {
        System.out.println("The sparrow is flying.");
    }

}
