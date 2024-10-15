package Assignment_3.task_3_Composite_Pattern;

public class File implements FileSystemComponent{
    private String name;
    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }

}
