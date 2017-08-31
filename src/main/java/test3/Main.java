package test3;

public class Main {
    public static void main(String[] args) {
        Integer i = 10;

        changeIt(i);

        // what is the value of 'i' now?
         System.out.println(i);
    }

    private static void changeIt(Integer i) {
        i = 15;
    }
}
