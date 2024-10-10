package dev.kamal.learnlld.lld1class7.addersubtractor;

public class Adder implements Runnable{
    private Count count;

    public Adder(Count count){
        this.count = count;
    }

    public void run(){
        for(int i=0; i<10000; i++){
            count.value += i;
        }
    }
}
