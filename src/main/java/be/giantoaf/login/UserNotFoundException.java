package be.giantoaf.login;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(String exceptionMessage) {
        super(exceptionMessage);
    }

}
