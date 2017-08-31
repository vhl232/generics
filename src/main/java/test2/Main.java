package test2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        System.out.println(dogs.size());

        changeIt(dogs);

        // how many dogs in the list now?
        // System.out.println(dogs.size());
    }

    private static void changeIt(List<Dog> dogs) {
        dogs.add(new Dog("Tuzik"));
    }
}
