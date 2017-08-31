package test6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Vasya", 16));
        people.add(new Person("Petya", 20));
        people.add(new Person("Kolya", 45));
        people.add(new Person("Nikita", 12));
        people.add(new Person("Natasha", 7));

        changeIt(people);

        // will the names and/or age change?
        for (Person p : people) {
            System.out.println(p);
        }

    }

    private static void changeIt(List<Person> people) {

        for (Person p : people) {
            p.name = "Tuzik";
            p.age = 100500;
        }

    }
}
