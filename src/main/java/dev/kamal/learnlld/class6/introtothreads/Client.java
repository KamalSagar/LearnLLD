package dev.kamal.learnlld.class6.introtothreads;

public class Client {

    public static void main(String[] args) {
        System.out.println("Main thread started - name : " + Thread.currentThread().getName());

        HelloWorldPrinter helloworld = new HelloWorldPrinter();
        Thread thread = new Thread(helloworld);
        thread.start();

        for(int i=1; i<=100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread1 = new Thread(numberPrinter);
            thread1.start();
        }
    }
}
