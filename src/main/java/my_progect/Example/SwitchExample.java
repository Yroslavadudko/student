package lessons.lesson_16.home_work.mykola_dudko;

import static java.lang.System.*;

public class SwitchExample {
    public static void main(String[] args) {
        String choice = "option4";

        switch (choice) {
            case "option1":
                out.println("You chose option 1");
                break;
            case "option2":
                out.println("You chose option 2");
                break;
            case "option3":
                out.println("You chose option 3");
                break;
            default:
                throw new IllegalArgumentException("Error: Invalid selection.");
        }
    }
}
