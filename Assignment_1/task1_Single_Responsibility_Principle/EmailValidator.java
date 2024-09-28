package Assignment_1.task1_Single_Responsibility_Principle;

public class EmailValidator {
    public boolean isValid(String email) {
        return email.contains("@") && email.contains(".");
    }
}
