package be.giantoaf.userInterface;

import be.giantoaf.users.User;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class StudentEnviroment implements Enviroment {

    private Scanner kbd = new Scanner(System.in);

    @Override
    public void start(User u) {
        boolean imDone = false;
        System.out.println("Welcome in the student enviroment" + u.getName());
        System.out.println("Type /help to get all options");
        while(!imDone) {
            String option = kbd.next();
            if(option.equals("/help")) this.getOptions();
            if(option.equals("/checkGrades")) this.checkMyGrades();
            if(option.equals("/exit")) {
                this.exit(u);
                imDone = true;
            }
        }
    }

    @Override
    public void getOptions() {
        System.out.println("as a student all you can do is check your grades.(/checkGrades)");
        System.out.println("Type /exit to close the app");
    }

    public void checkMyGrades() {
        System.out.println("You are doing well in school, keep it up!");
    }

    @Override
    public void exit(User u) {
        System.out.println("Goodbye " + u.getName());
    }

}
