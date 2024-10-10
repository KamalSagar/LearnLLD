package dev.kamal.learnlld.lld2.decorator;

public class Client {
    public static void main(String[] args) {
        demoDecorator();
    }

    public static void demoDecorator(){

        // Create a base Ice-cream
        IceCream iceCream = new ChocoCone();

        // Add toppings
        iceCream = new VanillaScoop(iceCream);
        iceCream = new PistaScoop(iceCream);
        iceCream = new ChocoScoop(iceCream);
        iceCream = new Cherry(iceCream);

        System.out.println("Description: " + iceCream.getDescription());
        System.out.println("Price: " + iceCream.getPrice());
    }
}
