package dev.kamal.learnlld.lld2.prototype.clone;

public class Client {
    public static void main(String[] args) {
        try{
            demoClone();
        }
        catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }

    }

    public static void demoClone() throws CloneNotSupportedException{
        Student st = new Student("Damodar", 25);
        Student stCopy = (Student) st.clone();

        System.out.println("DEBUG");
    }
}
