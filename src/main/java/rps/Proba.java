package rps;

import java.util.ArrayList;
import java.util.List;

public class Proba {

    public static void main(String[] args) {

        Combination <String>c= new Combination<>("dfd","hfhksfhk",null);


        System.out.println(c);



        System.out.println(c.getThree());

        int [] a = {10,20,30};
        int [] b = {40,50,60};
        int [] d = {70,80,90};

        Combination<int[]>fr = new Combination<>(a,b,d);

        System.out.println(fr.getTwo()[2]);


    }



}
