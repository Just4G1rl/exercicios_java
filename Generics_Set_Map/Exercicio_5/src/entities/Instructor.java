package entities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import service.Courses;

public class Instructor extends User {

    Set<Courses> courses = new TreeSet<>();
    Set<Students> student = new HashSet<>();

    public Instructor(String nome) {
        super(nome);
    }

    public void newCourse (Courses course){
        
    }

}
