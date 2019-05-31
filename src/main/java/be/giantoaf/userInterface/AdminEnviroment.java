package be.giantoaf.userInterface;

import be.giantoaf.users.User;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AdminEnviroment implements Enviroment {

    private Scanner kbd = new Scanner(System.in);

    @Override
    public void start(User u) {
        boolean imDone = false;
        System.out.println("Welcome in the admin enviroment" + u.getName());
        System.out.println("Type /help to get all options");
        while(!imDone) {
            String option = kbd.next();
            if(option.equals("/help")) this.getOptions();
            if(option.equals("/exit")) {
                this.exit(u);
                imDone = true;
            }
        }
    }

    @Override
    public void getOptions() {
        System.out.println("as an admin you can do everything!");
        System.out.println("Type /exit to close the app");
    }

    @Override
    public void exit(User u) {
        System.out.println("Goodbye " + u.getName());
    }

}
