package Assignment_3.task_4_Decorator_Pattern;

public class BoldDecorator extends TextDecorator{
    public BoldDecorator(TextEditor editor) {
        super(editor);
    }
    public String write() {
        return "<b>" + super.write() + "</b>";
    }
}
