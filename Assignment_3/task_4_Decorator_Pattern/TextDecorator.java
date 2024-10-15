package Assignment_3.task_4_Decorator_Pattern;

abstract class TextDecorator implements TextEditor{
    protected TextEditor editor;
    public TextDecorator(TextEditor editor) {
        this.editor = editor;
    }
    public String write() {
        return editor.write();
    }
}
