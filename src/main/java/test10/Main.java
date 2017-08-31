package test10;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Dog, Adress> map = new HashMap<>();

        Dog first = new Dog("Tuzik", Breed.AFGHAN_HOUND);
        Dog second = new Dog("Puzik", Breed.AIDI);
        Dog third = new Dog("Killer", Breed.AFFENPINSCHER);
        Dog fourh = new Dog("Momka", Breed.AKBASH);
        Dog fifth = new Dog("Bobik", Breed.AIREDALE_TERRIER);
        Dog sixth = new Dog("Grom", Breed.AKITA);

        map.put(first, new Adress("Ukraine", "Kiev", "Shevchenko", 15, 122));
        map.put(second, new Adress("Ukraine", "Kiev", "Shevchenko", 15, 15));
        map.put(third, new Adress("Ukraine", "Kiev", "Shevchenko", 15, 152));
        map.put(fourh, new Adress("Ukraine", "Kiev", "Shevchenko", 15, 1));
        map.put(fifth, new Adress("Ukraine", "Kiev", "Shevchenko", 15, 12));
        map.put(sixth, new Adress("Ukraine", "Kiev", "Shevchenko", 15, 13));

        for (Map.Entry<Dog, Adress> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
