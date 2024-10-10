package dev.kamal.learnlld.lld2.builder.productionbuilder;

public class Client {
    public static void main(String[] args) {
        Student.Helper builder = Student.getBuilder();

        builder.setName("Billu");
        builder.setAge(25);
        builder.setBatch("July23");
        builder.setGradYear(2024);
        builder.setPsp(84.5);

        Student s1 = builder.build();
        Student s2 = Student.getBuilder().setName("Rama").setAge(32).setGradYear(2024).setPsp(98.5).build();
        System.out.println("Debug");

    }
}
