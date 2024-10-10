package dev.kamal.learnlld.lld1class10;

public class Client {
    public static void main(String[] args) {
        demoGenericPair();
    }

    private static void demoGenericPair(){
        GenericPair<String, Integer> p1 = new GenericPair<>();

        p1.setFirst("Kamal");
        p1.setSecond(10000000);

        System.out.println("name: "+ p1.getFirst());
        System.out.println("Salary: "+ p1.getSecond());

        GenericPair<Double, Double> coordinates = new GenericPair<>(25.45, 56.98);

        System.out.println("X-coordinate: "+ coordinates.getFirst());
        System.out.println("Y-coordinate: "+ coordinates.getSecond());


    }
}
