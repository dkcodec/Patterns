package Assignment_3.task_4_Decorator_Pattern;

public class SimpleText implements TextEditor{
    @Override
    public String write() {
        return "This is plain text.";
    }
}
