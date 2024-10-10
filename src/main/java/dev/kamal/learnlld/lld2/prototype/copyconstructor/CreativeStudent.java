package dev.kamal.learnlld.lld2.prototype.copyconstructor;

import java.util.List;

public class CreativeStudent extends Student{
    int cq;

    public CreativeStudent(String name, int age, List<Integer> marks, int cq){
        super(name, age, marks);
        this.cq = cq;
    }

    public CreativeStudent(CreativeStudent student){
        super(student);
        this.cq = student.cq;
    }
}
