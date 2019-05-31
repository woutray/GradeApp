package be.giantoaf.login;

import be.giantoaf.users.Admin;
import be.giantoaf.users.Student;
import be.giantoaf.users.Teacher;
import be.giantoaf.users.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CurrentlyRegisteredUsers {

    public List<User> getCurrentUsers() {
        List<User> allUsers = new ArrayList<User>();
        allUsers.add(new Student().setName("walt").setPassword("walt"));
        allUsers.add(new Student().setName("theia").setPassword("theia"));
        allUsers.add(new Teacher().setName("patrick").setPassword("patrick"));
        allUsers.add(new Admin().setName("wout").setPassword("wout"));
        return allUsers;
    }

}
