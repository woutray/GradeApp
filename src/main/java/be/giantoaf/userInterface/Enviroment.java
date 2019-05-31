package be.giantoaf.userInterface;

import be.giantoaf.users.User;

public interface Enviroment {

    void start(User u);

    void getOptions();

    void exit(User u);

}
