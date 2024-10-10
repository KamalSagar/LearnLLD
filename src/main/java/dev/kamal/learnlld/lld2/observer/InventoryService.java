package dev.kamal.learnlld.lld2.observer;

public class InventoryService implements Subscriber{
    public void update(){
        System.out.println("Inventory has been updated");
    }
}
