package com.example.springbootwebappjsp;

import java.util.ArrayList;
import java.util.List;

public class StudentBusiness {
    private List<Student> students = new ArrayList<Student>();
    
    public StudentBusiness() {
        super();
        init();
    }
    public StudentBusiness(List<Student> students) {
        super();
        this.students = students;
    }
    public List<Student> getStudentList() {
        return this.students;
    }
    public void init(){
        this.students.add(new Student("000","marry"));
        this.students.add(new Student("001","john"));
        this.students.add(new Student("010","roger"));

    }
}
