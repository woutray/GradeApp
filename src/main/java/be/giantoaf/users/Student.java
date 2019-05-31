package be.giantoaf.users;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Student implements User {

    private String name;
    private String password;
    private List<Grade> myGrades = new ArrayList<Grade>();

    public Student setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public List<Grade> getMyGrades() {
        return myGrades;
    }

    public void setMyGrades(List<Grade> myGrades) {
        this.myGrades = myGrades;
    }

}
