package homework_11.Task_1.Exception;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String text) {
        super(text);
    }

    public WrongPasswordException() {
    }
}
