package be.giantoaf.users;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Teacher implements User {

    private String name;
    private String password;
    private Map<String, Grade> gradesForStudents = new HashMap<String, Grade>();

    public Teacher setPassword(String password) {
        this.password = password;
        return this;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Map<String, Grade> getGradesForStudents() {
        return gradesForStudents;
    }

    public void setGradesForStudents(Map<String, Grade> gradesForStudents) {
        this.gradesForStudents = gradesForStudents;
    }

}
