package lv.javaguru.courses.ingenico.lecture2.exceptions;

public class CustomException extends RuntimeException {

    private final ErrorCode errorCode;

    public CustomException(Throwable cause, ErrorCode errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public enum ErrorCode {
        SOME_PROBLEM
    }
}
