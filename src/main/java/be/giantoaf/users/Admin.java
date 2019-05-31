package be.giantoaf.users;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Admin implements User {

    private String name;
    private String password;
    private Map<String, Grade> allGradeSheets = new HashMap<String, Grade>();
    private List<Student> allStudents = new ArrayList<Student>();
    private List<Teacher> allTeachers = new ArrayList<Teacher>();

    public Admin setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Admin setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }



    public Map<String, Grade> getAllGradeSheets() {
        return allGradeSheets;
    }

    public void setAllGradeSheets(Map<String, Grade> allGradeSheets) {
        this.allGradeSheets = allGradeSheets;
    }

    public List<Student> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(List<Student> allStudents) {
        this.allStudents = allStudents;
    }

    public List<Teacher> getAllTeachers() {
        return allTeachers;
    }

    public void setAllTeachers(List<Teacher> allTeachers) {
        this.allTeachers = allTeachers;
    }

}
