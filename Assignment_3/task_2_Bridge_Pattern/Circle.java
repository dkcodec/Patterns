package Assignment_3.task_2_Bridge_Pattern;

public class Circle extends Shape{
    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    void draw() {
        renderer.renderShape("Circle");
    }
}
