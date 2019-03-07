package ir.itsurena.base.core.exception;

public class MethodArgumentNotValidException extends RuntimeException {

    public MethodArgumentNotValidException() {
        super("method argument is not valid  !!!!");
    }

    public MethodArgumentNotValidException(String message) {
        super(message);
    }
}
