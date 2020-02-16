package ObjectOrientedProgramming;

public class Animal {

    String name;
    String color;

    public void walk(String place) {

        System.out.println("We are walking here: " + place);
    }

    public void sleep() {

        System.out.println("Zzzzzzz");
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Vasya";
        dog.name = "Boris";

        cat.color = "White";
        dog.color = "Black";

        cat.walk("BackYard");
        dog.walk("Park");

        cat.feed("Milk");
        dog.sit();

        System.out.println("Cat name is:" + cat.name);
        System.out.println("Dog name is:" + dog.name);
    }
}
