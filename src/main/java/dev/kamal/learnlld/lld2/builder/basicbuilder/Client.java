package dev.kamal.learnlld.lld2.builder.basicbuilder;

public class Client {
    public static void main(String[] args) {
        Helper helper = new Helper();

        helper.setName("Kamal");
        helper.setAge(25);
        helper.setBatch("July23");
        helper.setGradYear(2024);
        helper.setPsp(84.5);

        Student student = new Student(helper);
        System.out.println("Debug");

    }
}
