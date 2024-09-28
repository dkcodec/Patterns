package Assignment_1.task_3_Liskov_Substitution_Principle;

public class Penguin extends Bird{
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly.");
    }
}
