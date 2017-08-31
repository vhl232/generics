package test0;

public class Main {

    public static void main(String[] args) {
        int a = 10;

        changeIt(a);

        // what is the value of 'a' now?
         System.out.println(a);
    }

    private static void changeIt(int a) {
        a = 15;
    }
}
