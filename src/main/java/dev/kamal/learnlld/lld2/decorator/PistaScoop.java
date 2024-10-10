package dev.kamal.learnlld.lld2.decorator;

public class PistaScoop extends ToppingDecorator{

    public PistaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    public Double getPrice(){
        return iceCream.getPrice() + 80.0;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", Pista Scoop";
    }
}
