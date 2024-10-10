package dev.kamal.learnlld.lld1class10;

public class GenericPair <F, S> {
    private F first;
    private S second;

    public GenericPair(){
        this.first = null;
        this.second = null;
    }

    public GenericPair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    } 

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst(){
        return this.first;
    }

    public S getSecond(){
        return this.second;
    }
}
