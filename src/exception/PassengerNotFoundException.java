package exception;

public class PassengerNotFoundException extends Exception{
    public PassengerNotFoundException() {
    }

    public PassengerNotFoundException(String message) {
        super(message);
    }

    public PassengerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PassengerNotFoundException(Throwable cause) {
        super(cause);
    }
}
