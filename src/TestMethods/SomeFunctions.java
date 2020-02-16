package TestMethods;

public class SomeFunctions {

    public static void main(String[] args) {

//        Declare local variables:

        int a = 13;
        int b = 3;
        int sum;
        int result;
        int[] array = {1, 22, 52, 34, 16};

        int summa = getSumm(array, "ILYA");
        System.out.println(summa + 100);

        sum = getSumm(a, b);

        result = getSumm(2, 4, 6);
        System.out.println(result);

        System.out.println();

        System.out.println(sum);

        sum = getSumm(10, 143);

        System.out.println(sum);

        System.out.println(getSumm(13, 44));

        System.out.println();

        showSum(10, 51, 77);

        saySmthng();

        sayHello("ILYA");
        sayHello("Ilya", "Sugako");
        sayHello();

        showSumToPerson("Ilysha", 3, 5, 999);

        boolean results = showSum(1, 22, 333);
        System.out.println(results);
    }

//    Declare method, that summ some variables:

    protected static int getSumm(int x, int y) {

        int sum;
        sum = x + y;

        return sum;
    }

    protected static int getSumm(int x, int y, int z) {

        int sum;
        sum = x + y + z;

        return sum;
    }

    protected static int getSumm(int[] array, String name) {

        int sum = 0;
        for(int i = 0; i < array.length; i++) {

            sum += array[i];
        }

        System.out.println("Hello, Mister " + name + "!");
        System.out.println("Your sum is: " + sum);
        return sum;
    }

    //    That method is saying "Hello"< and doesnt return anything:

    private static void sayHello(String name) {

        System.out.println("Hello, " + name + "!");
    }

    private static void sayHello(String name, String surname) {

        System.out.println("Hello, " + name + " " + surname + "!");
    }

    private static void sayHello() {

        System.out.println("Hello!");
    }


//    That method show true/false variables:

    private static boolean showSum(int x, int y, int z) {

        int sum = x + y + z;

        System.out.println(sum);

        return true;
    }

//    This method is returning saying something:

    public static void saySmthng() {

        System.out.println();
        System.out.print("Say");
        System.out.print(" : ");
        System.out.println("Hello");
    }

//    That method shows name ofperson and sum from three variables:

    static void showSumToPerson(String name, int a, int b, int c) {

        System.out.println("Start of programm!");
        sayHello(name);

        showSum(a, b, c);

        System.out.println("End of programm!");
    }
}
