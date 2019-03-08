package nl.tue.base.core.exception;

public class CanNotInsertEntityException  extends RuntimeException{

    public CanNotInsertEntityException() {
        super("can not insert entity !!!");

    }

    public CanNotInsertEntityException(String message) {
        super(message);
    }
}
