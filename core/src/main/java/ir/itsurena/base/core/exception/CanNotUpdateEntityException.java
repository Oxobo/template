package ir.itsurena.base.core.exception;

public class CanNotUpdateEntityException extends RuntimeException {

    public CanNotUpdateEntityException() {
        super("can not update entity !!!");
    }

    public CanNotUpdateEntityException(String message) {
        super(message);
    }
}
