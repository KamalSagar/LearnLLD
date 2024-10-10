package dev.kamal.learnlld.lld2.observer;

public class EmailService implements Subscriber{
    public void update(){
        System.out.println("Email has been sent to the subscriber");
    }
}
