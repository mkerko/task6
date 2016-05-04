package by.epam.training.filter;

public class FilterException extends Exception {
    public FilterException(){}
    public FilterException(String message, Throwable exception) {
        super(message, exception);
    }
    public FilterException(String message) {
        super(message);
    }
    public FilterException(Throwable exception) {
        super(exception);
    }
}
