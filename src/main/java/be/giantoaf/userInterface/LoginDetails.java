package be.giantoaf.userInterface;

import be.giantoaf.login.HardCodedLoginImpl;
import be.giantoaf.login.UserNotFoundException;
import be.giantoaf.users.Student;
import be.giantoaf.users.Teacher;
import be.giantoaf.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LoginDetails {

    private Scanner kbd = new Scanner(System.in);

    @Autowired
    private HardCodedLoginImpl loginImpl;
    @Autowired
    private StudentEnviroment studentEnviroment;
    @Autowired
    private TeacherEnviroment teacherEnviroment;
    @Autowired
    private AdminEnviroment adminEnviroment;

    public void loginTime() throws UserNotFoundException {
        System.out.println("Hello user");
        System.out.println("What do you wish to do?");
        System.out.println("=====================");
        System.out.println("1. Login");
        System.out.println("2. Exit");
        if (kbd.next().equals("1")) {
            User u = this.askForLoginDetails();
            if (u.getClass() == Student.class) studentEnviroment.start(u);
            else if (u.getClass() == Teacher.class) teacherEnviroment.start(u);
            else adminEnviroment.start(u);
        } else System.out.println("Goodbye!");
    }

    public User askForLoginDetails() throws UserNotFoundException {
        System.out.println("Please enter your username");
        String username = kbd.next();
        System.out.println("Now please enter your password");
        String password = kbd.next();
        User u = loginImpl.login(username, password);
        System.out.println("Welcome: " + u.getName());
        return u;
    }

}
