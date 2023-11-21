package homework_11.Task_1.Exception;

public class WrongLoginException extends Exception {
    public WrongLoginException(String text) {
        super(text);
    }

    public WrongLoginException() {
    }
}
