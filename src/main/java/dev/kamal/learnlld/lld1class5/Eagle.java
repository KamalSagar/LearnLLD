package dev.kamal.learnlld.lld1class5;

public class Eagle implements Bird{

    @Override
    public void move(){
        System.out.println("Eagle moves");
    }

    @Override
    public void eat(){
        System.out.println("Eagle eats");
    }

    public void fly(){
        System.out.println("Eagle flies");
    }

}
