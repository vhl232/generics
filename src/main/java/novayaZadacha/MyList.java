package novayaZadacha;

public class MyList<D> implements MyListI<D>{

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

    @Override
    public void add(int index, D element) {

    }

    @Override
    public D set(int index, D element) {
        return null;
    }

    public D remove(int index){

        if(index<size) {
            D element = (D) massiv[index];

            for (int i = index; i < size; i++) {

                massiv[i] = massiv[i + 1];

            }
            size--;
            return element ;
        }
        return null;

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    public  int size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }


}
