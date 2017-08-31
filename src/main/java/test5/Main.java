package test5;

public class Main {
    public static void main(String[] args) {
        Integer i = 10;

        i = changeIt(i);

        // what is the value of 'i' now?
         System.out.println(i);
    }

    private static Integer changeIt(int i) {
        i = i + 5;
        return i;
    }
}
