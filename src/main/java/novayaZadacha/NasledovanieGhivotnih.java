package novayaZadacha;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class NasledovanieGhivotnih implements Serializable{

   public static void piupiu(List<? super Number> a){
       for (int i = 0; i < a.size() ; i++) {

           System.out.println("piupiu" + a.get(i));
       }
   }

    public static void main(String[] args) throws IOException {

       List<Double> doub = new LinkedList<>();


       doub.add(6.);
       doub.add(7.);
       //piupiu(doub);

        Woman hghg =new Woman("Natasha",18,173.5f);
        System.out.println(hghg);

        FileOutputStream s = new FileOutputStream("/home/vladimir/woman.out");

        ObjectOutputStream w = new ObjectOutputStream(s);


        w.writeObject(hghg);
        w.flush();
        w.close();

    }


}
