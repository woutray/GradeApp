package be.giantoaf.login;

import be.giantoaf.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HardCodedLoginImpl implements LoginService {

    @Autowired
    private CurrentlyRegisteredUsers currentlyRegisteredUsers;

    public User login(String username, String userpassword) throws UserNotFoundException {
        List<User> allUsers = currentlyRegisteredUsers.getCurrentUsers();
        for (User u : allUsers) {
            if (username.equalsIgnoreCase(u.getName()) && userpassword.equalsIgnoreCase(u.getPassword())) return u;
        }
        throw new UserNotFoundException("The login details were wrong!");
    }

}
