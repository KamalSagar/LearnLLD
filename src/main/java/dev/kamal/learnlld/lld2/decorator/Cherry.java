package dev.kamal.learnlld.lld2.decorator;

public class Cherry extends ToppingDecorator{

    public Cherry(IceCream iceCream){
        this.iceCream = iceCream;
    }

    public Double getPrice(){
        return iceCream.getPrice() + 40.0;
    }

    public String getDescription(){
        return iceCream.getDescription() + "Cherry";
    }
}
