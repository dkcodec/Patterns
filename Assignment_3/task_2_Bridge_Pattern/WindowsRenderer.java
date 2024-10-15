package Assignment_3.task_2_Bridge_Pattern;

public class WindowsRenderer implements Renderer {
    @Override
    public void renderShape(String shape) {
        System.out.println("Rendering " + shape + " on Windows.");
    }
}
