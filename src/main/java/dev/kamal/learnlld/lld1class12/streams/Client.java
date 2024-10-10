package dev.kamal.learnlld.lld1class12.streams;

import dev.kamal.learnlld.lld1class12.lambdas.Student;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        demoStream();
    }

    private static void demoStream() {

        List<Integer> nums = Arrays.asList(2,3,1,5,6);
        List<Integer> oddNums = nums.stream().filter( (x) -> x%2 == 1).toList();
        System.out.println(oddNums);

        List<Student> students = Arrays.asList(
                new Student("Ram", 89, 1),
                new Student("Shyam", 78, 3),
                new Student("Krishna", 99, 2)
        );

        System.out.println(students.stream().map(student -> student.marks).toList());

        List<String> students2 = Arrays.asList("Ram", "Shyam", "Madhusudhan", "Hrishikesh");
        System.out.println(students2.stream().map( String::toUpperCase).toList());

        // FlatMap
    }


}
