package test1;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();

        changeIt(apple);

        // what is the color of the apple now?
         System.out.println(apple.getColor());
    }

    private static void changeIt(Apple apple) {
        apple.setColor("green");
    }
}
