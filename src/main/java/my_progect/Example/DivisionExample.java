package lessons.lesson_16.home_work.mykola_dudko;

import static java.lang.System.*;

public class DivisionExample {
    public static double divide(int x, int y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Error: Division by zero is not possible.");
            }
            return (double) x / y;
        } catch (ArithmeticException e) {
            err.println(e.getMessage());
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        double result = divide(dividend, divisor);
        out.println("Result: " + result);
    }
}
