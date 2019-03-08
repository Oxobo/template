package nl.tue.base.core.exception;

public class CanNotDeleteEntityException extends RuntimeException{

    public CanNotDeleteEntityException() {
        super("can not delete entity !!!");
    }

    public CanNotDeleteEntityException(String message) {
        super(message);
    }
}
