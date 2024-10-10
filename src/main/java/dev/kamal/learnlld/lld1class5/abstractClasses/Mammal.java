package dev.kamal.learnlld.lld1class5.abstractClasses;

public abstract class Mammal {
    int limbs;
    String name;

    abstract void move();
    void eat() {
        System.out.println("Mammal eats");
    }
}
