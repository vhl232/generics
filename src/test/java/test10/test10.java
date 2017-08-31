package test10;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class test10 {

    @Test
    public void directVariableAccess() {
        Field[] fields = Dog.class.getFields();
        Assert.assertTrue("Fields are accessible for direct modifications", fields == null || fields.length == 0);
    }

    @Test
    public void settersChangingObject() {
        Dog dog = new Dog("a", Breed.AKITA);
        Dog anotherDog = new Dog("a", Breed.AKITA);
        anotherDog.setBreed(Breed.AIREDALE_TERRIER);
        anotherDog.setName("b");
        Assert.assertEquals(dog.getName(), anotherDog.getName());
        Assert.assertEquals(dog.getBreed(), anotherDog.getBreed());
    }
}
