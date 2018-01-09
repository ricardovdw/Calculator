package rekenmachine;

public class Rekenmachine {

    
    public static void main(String[] args) {
        System.out.print("5 * 3 = ");
        System.out.println(multiply(5, 3));
        System.out.print("30 / 6 = ");
        System.out.println(divide(30, 6));
        System.out.print("8 square = ");
        System.out.println(square(8));
        System.out.print("2 ^4 = ");
        System.out.println(exponentiation(2,4));

    }

    
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {
        return number1 + -number2;
    }

    public static int multiply(int a, int b) {

        int number1 = 0;

        while (b != 0) {
            number1 = add(number1, a);
            b--;

        }
        return number1;
    }

    public static int divide(int a, int b) {
        int number1 = 0;

        while (a >= b) {
            a = subtract(a, b);
            number1++;
        }
        return number1;

    }

    public static int square(int number1) {

        int a = multiply(number1, number1);

        return a;
    }

    public static int exponentiation(int number1, int number2) {
        int a = number1;  // getal
        int round = 1;

        while (round < number2) {
            a = multiply(a, number1);
            round = round+1;
        }
        return a;
    }

}