package entities;

import java.util.LinkedHashSet;
import java.util.Set;

import service.Courses;

public class Students extends User{
    
    Set<Courses> courses = new LinkedHashSet<>();

    public Students(String nome) {
        super(nome);
    }

    public void getCourses

    public void addCuourse(Courses course){
        if(!courses.contains(course)){
            this.courses.add(course);
        }
    }


}
