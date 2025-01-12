package dev.kamal.learnlld.lld2.prototype.prototype;

import java.util.List;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(String name, int age, List<Integer> marks, int iq){
        super(name, age, marks);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }
}
