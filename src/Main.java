import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        //create a new Object array called list that calls Dog and DogFood
        //Object[] list = {new Dog(), new DogFood()};
        //((Dog) list[0]).makeSound(); calls makeSound() which prints bark
/*        for(Object object : list){ loops thru list
            if (object instanceof Animal){
                ((Animal) object).makeSound();
            }*/
        //Dog dog1 = new Dog(); makes new non-static Dog
        //Dog dog2 = new Dog(); makes another new non-static dog to test equality of hashcodes
        Dog dog1 = new Dog("bark");
        Dog dog2 = new Dog("woof");
        System.out.println("The two dogs are " + dog1.equals(dog2));
    }
        //Animal animal = new Animal(); received error stating class is abstract
    }
//abstract class which means can't be instantiated
abstract class Animal {
    String sound = "";
    Animal(String sound){ //constructor
        System.out.println(sound);
    }
    //creates abstract method
    abstract void findFood();

    void makeSound() {
        System.out.println(sound);
    }
     @Override
    public String toString() {//returns info about class
        return getClass().getSimpleName() + ": sound = " + sound;
    }

    @Override//makes dog1 and dog2 same hashcode due to makeSound() method
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(sound, animal.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sound);
    }
}
class Dog extends Animal{
    Dog(String sound){
        //sound = "bark";
        // use super instead because of Animal(String sound)
        super( sound); // changes from "bark" string to sound parameter
    }
    @Override
    void findFood(){
        System.out.println("*looks at human*");
        makeSound();
    }
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("wags tail*");
    }
}

class DogFood{}