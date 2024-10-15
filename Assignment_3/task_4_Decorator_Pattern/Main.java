package Assignment_3.task_4_Decorator_Pattern;

public class Main {
    public static void main(String[] args) {
        TextEditor plainText = new SimpleText();
        TextEditor boldText = new BoldDecorator(plainText);
        TextEditor italicBoldText = new ItalicDecorator(boldText);
        System.out.println(plainText.write()); // Output: This is plain text.
        System.out.println(boldText.write()); // Output: <b>This is plain text.</b>
        System.out.println(italicBoldText.write()); // Output: <i><b>This is plain text.</b></i>
    }
}
