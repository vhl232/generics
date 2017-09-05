package novayaZadacha;

public class NovayZadacha {
    public static void main(String[] args) {

        MyList<String> list1 = new MyList<>();

        for (int i =0; i <1000 ; i++) {

            list1.add(""+i);

        }

        printt(list1);



        /*System.out.println(list1.size());

        list1.remove(3);
        printt(list1);

        list1.remove(0);
        printt(list1);
        System.out.println(list1.size());
        //printt(list1);*/

    }

    private static void printt(MyList a) {
        for (int i = 0; i <a.size() ; i++) {

            System.out.print(a.get(i)+" ");

        }
        System.out.println(" ");
    }


}
