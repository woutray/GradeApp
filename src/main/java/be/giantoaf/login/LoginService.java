package be.giantoaf.login;

import be.giantoaf.users.User;

public interface LoginService {

    User login(String username, String userpassword) throws UserNotFoundException;

}
