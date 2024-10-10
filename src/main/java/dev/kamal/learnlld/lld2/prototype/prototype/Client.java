package dev.kamal.learnlld.lld2.prototype.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
//        demoPrototype();
        demoRegistry();
    }

    private static void fillRegistry(StudentRegistry studentRegistry) {
        List<Integer> marks = new ArrayList<>();
        marks.add(45);
        marks.add(89);

        Student st = new Student("Lakshay", 26, marks);
        IntelligentStudent is = new IntelligentStudent("Krishna", 22, marks, 345);
        CreativeStudent cs = new CreativeStudent("Gopal", 24, marks, 244);

        studentRegistry.register(StudentType.STUDENT, st);
        studentRegistry.register(StudentType.CREATIVE_STUDENT, cs);
        studentRegistry.register(StudentType.INTELLIGENT_STUDENT, is);
    }

    public static void demoRegistry(){
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student stPrototype = studentRegistry.get(StudentType.STUDENT);
        Student isPrototype = studentRegistry.get(StudentType.INTELLIGENT_STUDENT);
        Student csPrototype = studentRegistry.get(StudentType.CREATIVE_STUDENT);

        Student stCopy = stPrototype.copy();
        Student isCopy = isPrototype.copy();
        Student csCopy = csPrototype.copy();

        System.out.println("debug");
    }


    public static void demoPrototype(){
        List<Integer> marks = new ArrayList<>();
        marks.add(45);
        marks.add(89);

        List<Student> studentsList = new ArrayList<>();
        List<Student> studentsCopyList = new ArrayList<>();


        Student st = new Student("Lakshay", 26, marks);
//        Student stCopy = st.copy();
        IntelligentStudent is = new IntelligentStudent("Krishna", 22, marks, 345);
//        IntelligentStudent isCopy = is.copy();
        CreativeStudent cs = new CreativeStudent("Gopal", 24, marks, 244);
//        CreativeStudent csCopy = cs.copy();

        studentsList.add(st);
        studentsList.add(is);
        studentsList.add(cs);

        for(Student student: studentsList){
            Student stcopy = student.copy();
            studentsCopyList.add(stcopy);
        }



        System.out.println("DEBUG");

    }
}
