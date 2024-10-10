package dev.kamal.learnlld.lld2.prototype.copyconstructor;

import java.util.List;

public class Student {
    String name;
    int age;
    List<Integer> marks;

    public Student(String name, int age, List<Integer> marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.marks = student.marks;
    }
}
