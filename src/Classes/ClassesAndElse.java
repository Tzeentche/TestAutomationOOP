package Classes;

public class ClassesAndElse {

    public static void main(String[] args) {

//             Create class example

        Car car1 = new Car();

//        Set example variables:

        car1.color = "Black";
        car1.lenght = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(100);
        car1.drive(120);

        car1.addWeight(700);
        car1.drive(100);

//        Create new examples:
        Car car2= new Car();
        Car car3 = new Car();
        car3.color = "Red";

        car2.drive(120);
        car3.drive(150);

        Car car4 = new Car("Black");

        System.out.println("Car color is: " + car4.color);

        Car car5 = new Car("red", 2100, 2000,5100);

        System.out.println(car5.color + " " + car5.height + " " + car5.width + " " + car5.lenght);

        System.out.println(Car.var);

        Car.var = 100;

        System.out.println(Car.var);
        System.out.println(car1.var);
        System.out.println(car2.var);
        System.out.println(car3.var);

        Car.method();

        String.format("New is string", "string");
    }
}
