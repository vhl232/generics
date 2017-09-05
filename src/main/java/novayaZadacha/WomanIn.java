package novayaZadacha;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;

public class WomanIn {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

        FileInputStream a = new FileInputStream("/home/vladimir/woman.out");

        ObjectInputStream s = new ObjectInputStream(a);


        Object o = s.readObject();

        if(o instanceof Woman){
            Woman woman2 = (Woman) o;
            System.out.println("ura");
            System.out.println(woman2);
            woman2.sayHallo();

            Woman w3 = (Woman) woman2.clone();
            System.out.println(w3);
        }




    }
}
