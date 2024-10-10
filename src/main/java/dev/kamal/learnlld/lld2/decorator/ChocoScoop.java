package dev.kamal.learnlld.lld2.decorator;

public class ChocoScoop extends ToppingDecorator{

    public ChocoScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    public Double getPrice(){
        return iceCream.getPrice() + 90.0;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", Choco Scoop";
    }
}
