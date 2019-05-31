package be.giantoaf;

import be.giantoaf.config.ConfigFileForApplication;
import be.giantoaf.login.UserNotFoundException;
import be.giantoaf.userInterface.LoginDetails;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigFileForApplication.class);

        LoginDetails login = context.getBean("loginDetails", LoginDetails.class);

        try {
            login.loginTime();
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

        context.close();

    }

}
