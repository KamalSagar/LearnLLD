package dev.kamal.learnlld.lld1class8.atomicinteger;

public class Subtractor implements Runnable{

    private Count count;

    public Subtractor(Count count){
        this.count = count;
    }

    public void run(){
        for(int i=0; i<10000; i++){
            System.out.println("Subtractor : " + i + " "+ Thread.currentThread().getName());
            count.value.addAndGet(-i);
        }
    }
}