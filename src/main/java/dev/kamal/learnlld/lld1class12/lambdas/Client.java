package dev.kamal.learnlld.lld1class12.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class Client {
    public static void main(String[] args) {
//        demoLambda();
//        demoRunnableExample();
        demoComparator();
    }

    private static void demoComparator() {

        List<Student> students = Arrays.asList(
                new Student("Ram", 89, 1),
                new Student("Shyam", 78, 3),
                new Student("Krishna", 99, 2)
        );

        Comparator<Student> marksComparator = (st1, st2) -> st1.marks - st2.marks;
        students.sort(marksComparator);
        System.out.println(students);

        Comparator<Student> rollNumComparator = (st1, st2) -> st1.rollNum - st2.rollNum;
        students.sort(rollNumComparator);
        System.out.println(students);
    }

    private static void demoRunnableExample() {

        Runnable runnable = () -> {
            System.out.println("Hello from thread " + Thread.currentThread().getName());

        };

        Thread thread = new Thread(runnable);
        thread.start();

        // More optimized

        Thread thread2  = new Thread(() -> System.out.println("optimized thread " + Thread.currentThread().getName()));
        thread2.start();

    }

    private static void demoLambda() {
        Consumer<String> c1 = (str) -> {
            System.out.println(str);
        };
        c1.accept("Scaler");

        BiConsumer<String, Integer> b1 = (str, num) -> {
            System.out.println(str + " " + num);
        };
        b1.accept("Kamal", 500000);

        Predicate<String> p1 = (str) -> {
            if(str.length() >5) return true;
            return false;
        };

        System.out.println( p1.test("Kamal Sagar"));
        System.out.println(p1.test("Kamal"));

        Predicate<String> p2 = (str) -> { return str.length() > 5;  };

        System.out.println( p2.test("Kamal Sagar"));
        System.out.println(p2.test("Kamal"));


        Predicate<String> p3 = (str) ->  str.length() > 5;

        System.out.println( p3.test("Kamal Sagar"));
        System.out.println(p3.test("Kamal"));


    }
}
