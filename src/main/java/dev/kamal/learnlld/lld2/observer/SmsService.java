package dev.kamal.learnlld.lld2.observer;

public class SmsService implements Subscriber{
    public void update(){
        System.out.println("SMS has been sent to the subscriber");
    }
}
