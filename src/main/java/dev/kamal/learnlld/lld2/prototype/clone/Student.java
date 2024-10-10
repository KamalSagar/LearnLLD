package dev.kamal.learnlld.lld2.prototype.clone;

public class Student implements Cloneable{
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}
