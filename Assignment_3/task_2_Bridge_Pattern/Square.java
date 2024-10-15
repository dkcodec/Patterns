package Assignment_3.task_2_Bridge_Pattern;

public class Square extends Shape{

    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    void draw() {
        renderer.renderShape("Square");
    }
}
