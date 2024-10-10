package dev.kamal.learnlld.class6.introtothreads;

public class NumberPrinter implements Runnable{
    private int number;
    public NumberPrinter(int number) {
        this.number = number;
    }

    public void run(){
        System.out.println("Printing number " + this.number + " " + Thread.currentThread().getName());
    }
}
