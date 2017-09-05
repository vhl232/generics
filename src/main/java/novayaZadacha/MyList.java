package novayaZadacha;

public class MyList<D> {

    private int size = 0;

    Object[]massiv = new Object[10];

    public D get(int index){
     return(D) massiv[index];
    };


    public void add(D element){

        if (size < massiv.length-1) {

            massiv[size] = element;
            size++;
        }
        else {
            Object [] newMassiv = new Object[(int) (massiv.length*1.5)];

            System.arraycopy(massiv, 0, newMassiv, 0, massiv.length);

            massiv = newMassiv;
            massiv[size]=element;
            size++;
        }

    }

    public boolean remove(int index){

        if(index<size) {
            for (int i = index; i < size; i++) {

                massiv[i] = massiv[i + 1];

            }
            size--;
            return true;
        }
        return false;

    }

    public  int size(){
        return size;
    }



}
