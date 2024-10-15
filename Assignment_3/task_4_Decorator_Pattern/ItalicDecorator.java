package Assignment_3.task_4_Decorator_Pattern;

public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextEditor editor) {
        super(editor);
    }
    public String write() {
        return "<i>" + super.write() + "</i>";
    }
}
