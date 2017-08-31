package test10;

public class Dog {
    private String name;
    private Breed breed;

    public Dog(String name, Breed breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        return new Dog(name,breed);
    }

    public Breed getBreed() {
        return breed;
    }

    public Dog setBreed(Breed breed) {
        return new Dog(name,breed);
    }
}
