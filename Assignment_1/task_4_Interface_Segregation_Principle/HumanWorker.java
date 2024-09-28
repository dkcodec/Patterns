package Assignment_1.task_4_Interface_Segregation_Principle;

public class HumanWorker implements Eatable, Workable{

    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }

    @Override
    public void work() {
        System.out.println("Human is working.");
    }
}
