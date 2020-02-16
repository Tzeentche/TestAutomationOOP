package ExtensionSet;

//      Three methods to output exceptions:

public class Lesson24 {

    public static void main(String[] args) {

//        First method:

        try {
            devide(10, 0);
        } catch (ArithmeticException e) {

            e.printStackTrace();
        }

        devide(10, 0, 7);
    }

    public static void devide(int a, int b) {

//        Usual method:

        try {
            System.out.println("Result is: " + a/b);

        } catch (ArithmeticException ex) {

            System.out.println("Problem!");

        } finally {

            System.out.println("Finish!");
        }
    }

    public static void devide(int a, int b, int z) {

        if (b == 0) {

//            Third method:

            throw new ArithmeticException("Cannnot devide by zero!");
        }
    }
}
