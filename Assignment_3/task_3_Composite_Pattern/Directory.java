package Assignment_3.task_3_Composite_Pattern;
import java.util.*;

public class Directory implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();
    public Directory(String name) {
        this.name = name;
    }
    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
