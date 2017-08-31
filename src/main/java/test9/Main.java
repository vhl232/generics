package test9;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Thread> map = new HashMap<>();

        map.put("First thread", new Runner("Vasya", 2, 3.729));
        map.put("Second thread", new Runner("Kolya", 3, 3.544));
        map.put("Third thread", new Runner("Petya", 1, 3.205));
        map.put("Fourth thread", new Runner("Natasha", 4, 3.911));

        // starting threads
        for (Map.Entry<String, Thread> pair : map.entrySet()) {
            System.out.println("Starting " + pair.getKey() + "...");
            pair.getValue().start();
        }

        // running process
        System.out.print("Running");
        for (int i = 0; i < 19; i++) {
            Thread.sleep(1000);
            System.out.print('.');
        }
        System.out.println("\n");

        // stop runners here
        // ...

        for (Map.Entry<String, Thread> pair : map.entrySet()) {
            pair.getValue().join();
            System.out.print(pair.getKey() + " stopped.");
            System.out.println("\t" + pair.getValue());
        }

        // print which thread won here. the name of the thread
        // ...
    }
}
