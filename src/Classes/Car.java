package Classes;

public class Car {

    static int var = 10;
    static void method() {

        System.out.println("Static metthod!");
    }

    public Car(){

        System.out.println("New car created!");
    }

    public Car(String color){

        this.color = color;
    }

    public Car(String color, int height, int width, int length){

        this.color = color;
        this.height = height;
        this.width = width;
        this.lenght = length;

    }

//    Declare global variables:

    int height;
    int width;
    int lenght;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

//    Create first method:

    public void addWeight(int weight) {

        this.weight += weight;
    }

//    Create second method:

    public void drive(int speed) {

        if(weight <= maxWeight) {

            this.speed = speed;
            System.out.println("We are driving!!");
        } else {

            System.out.println("Cannot drive!");
        }
    }
}
