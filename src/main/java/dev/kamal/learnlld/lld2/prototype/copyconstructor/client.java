package dev.kamal.learnlld.lld2.prototype.copyconstructor;

import java.util.ArrayList;
import java.util.List;

public class client {

    public static void main(String[] args) {
        demoCopyConstructor();
    }

    private static void demoCopyConstructor() {
        List<Student> students = new ArrayList<>();
        List<Student> studentsCopy = new ArrayList<>();

        List<Integer> marks = new ArrayList<>();
        marks.add(67);
        marks.add(87);
        marks.add(99);

        Student st = new Student("Kamal", 25, marks);
        CreativeStudent cs = new CreativeStudent("Yaman", 26,marks, 340);
        IntelligentStudent is = new IntelligentStudent("Tuhin", 25,marks, 240);

        students.add(st);
        students.add(is);
        students.add(cs);

        for(Student student:students){
            Student stCopy = null;
            if(student instanceof IntelligentStudent){
                IntelligentStudent isCopy = (IntelligentStudent) student;
                stCopy = new IntelligentStudent(isCopy);
            }
            else if( student instanceof CreativeStudent){
                CreativeStudent isCopy = (CreativeStudent) student;
                stCopy = new CreativeStudent(isCopy);
            }
            else{
                Student isCopy = student;
                stCopy = new Student(isCopy);
            }
            studentsCopy.add(stCopy);
        }
        System.out.println("Debug");

    }


}
