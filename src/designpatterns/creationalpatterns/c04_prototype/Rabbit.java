package designpatterns.creationalpatterns.c04_prototype;

public class Rabbit implements Cloneable {

    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH
    }

    private int age;
    private Breed breed;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    protected Rabbit clone() throws CloneNotSupportedException {
        try {
            return (Rabbit) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
