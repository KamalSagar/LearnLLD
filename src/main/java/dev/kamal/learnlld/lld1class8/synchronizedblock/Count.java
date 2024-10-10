package dev.kamal.learnlld.lld1class8.synchronizedblock;

public class Count extends Object{
    public int value = 0;

    public synchronized void incrementValue(int offset){

        this.value += offset;
    }

    public int getValue(){
        return this.value;
    }
}
