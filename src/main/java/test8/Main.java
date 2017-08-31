package test8;

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
            changeName(p.name);
            changeAge(p.age);
        }

        // will the names and/or age change?
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void changeName(String name) {
        name = "Tuzik";
    }

    private static void changeAge(int age) {
        age = 100500;
    }
}
