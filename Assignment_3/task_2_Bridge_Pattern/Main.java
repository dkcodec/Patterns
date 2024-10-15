package Assignment_3.task_2_Bridge_Pattern;

public class Main {
    public static void main(String[] args) {
        Renderer windowsRenderer = new WindowsRenderer();
        Renderer linuxRenderer = new LinuxRenderer();
        Shape circle = new Circle(windowsRenderer);
        Shape square = new Square(linuxRenderer);
        circle.draw(); // Rendering Circle on Windows
        square.draw(); // Rendering Square on Linux
    }
}
