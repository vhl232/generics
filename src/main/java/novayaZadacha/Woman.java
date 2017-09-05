package novayaZadacha;

import java.io.Serializable;

public class Woman implements Serializable,Cloneable{

    private String name;
    private transient int age;
    private float heigth;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void sayHallo(){

        System.out.println("hallo");
    }


    public Woman(String name, int age, float heigth) {
        this.name = name;
        this.age = age;
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heigth=" + heigth +
                '}';
    }
}
