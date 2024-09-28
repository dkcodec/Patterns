package Assignment_1.task_4_Interface_Segregation_Principle;

public class RobotWorker implements Workable{
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}
