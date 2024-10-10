package dev.kamal.learnlld.lld2.decorator;

public class VanillaScoop extends ToppingDecorator{

    public VanillaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    public Double getPrice(){
        return iceCream.getPrice() + 70.0;
    }

    public String getDescription(){
        return iceCream.getDescription() + ", Vanilla Scoop";
    }
}
