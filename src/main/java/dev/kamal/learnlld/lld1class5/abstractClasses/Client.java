package dev.kamal.learnlld.lld1class5.abstractClasses;

public class Client {

    public static void main(String[] args){
        demoAbstractClass();
    }

    private static void demoAbstractClass(){
        Tiger tiger = new Tiger();
        tiger.move();
        tiger.eat();
    }
}
