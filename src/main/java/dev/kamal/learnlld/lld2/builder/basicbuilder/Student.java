package dev.kamal.learnlld.lld2.builder.basicbuilder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private String phoneNum;
    private String email;
    private String univName;
    private int gradYear;
    private Double psp;

    public Student(Helper builder){
        if(builder.getGradYear() <2024){
            throw new RuntimeException("Grad year must be 2024");
        }
        if(builder.getPsp() < 55){
            throw new RuntimeException("PSP should >= 70");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.phoneNum = builder.getPhoneNum();
        this.email = builder.getEmail();
        this.univName = builder.getUnivName();
        this.gradYear = builder.getGradYear();
        this.psp = builder.getPsp();
    }
}
