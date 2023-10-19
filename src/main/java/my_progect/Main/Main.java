package lessons.lesson_6.home_work.mykola_dudko;
public class Main {
    public  static void main(String[] args) {
        int a = 6;
        int b = 8;
        int c = 12;
        int d = 7;

        int result1 = a + c;
        int result2 = b + d;

        System.out.println("We assign values to 4 fields of type int - " + a + ", " + b + ", " + c + ", " + d);

        System.out.println("I add them in pairs - " + ((a + c) + (b + d)));

        System.out.println("Is the first amount greater? - " + (result1 > result2));

        result1++;
        result2-=2;

        System.out.println("Increases the first amount by 1 - " + result1);

        System.out.println("Decreases the second amount by 2 - " + result2);

        System.out.println("Is the first amount higher after the changes? - " + (result1 > result2));

        System.out.println("At least one amount that is a multiple of 2? - " + ((result1 % 2 == 0) || (result2 % 2 == 0)));
    }
}
