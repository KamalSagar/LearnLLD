package dev.kamal.learnlld.lld1class5;

public interface Animal {
    void move();
    void eat();
    default void fly(){
        System.out.println("Oops can't fly");
    }
}
