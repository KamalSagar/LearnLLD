package dev.kamal.learnlld.lld1class5;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        demoInterface();
    }

    private static void demoInterface(){
        Lion lion = new Lion();
//        lion.move();
//        lion.eat();
//        lion.fly();

        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(new Eagle());

        for(Animal animal : animals){
            animal.fly();
        }

    }
}
