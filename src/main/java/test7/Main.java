package test7;

import test6.Person;

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

        for (Person p : people) {
            changeIt(p);
        }

        // will the names and/or age change?
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void changeIt(Person p) {
        System.out.println(p);
        p = new Person("Tuzik", 100500);
    }
}
