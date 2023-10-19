package my_progect.Person;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Man man = new Man("Mykola", "Dudko", 45, null);
        Woman woman = new Woman("Nataly", "Sherbina", 38, man, "Dudko");



        if (man.isRetired()){
            LOGGER.info(man.getFirstName() + " " + man.getLastName() + " is a retired.");
        } else {
            LOGGER.info(man.getFirstName() + " " + man.getLastName() + " not yet retired.");
        }

        if (woman.isRetired()){
            LOGGER.info(woman.getFirstName() + " " + woman.getPreviousLastName() + " is a retired.");
        } else {
            LOGGER.info(woman.getFirstName() + " " + woman.getPreviousLastName() + " not yet retired.");
        }

        man.registerPartnership(woman);
        LOGGER.info(man.getFirstName() + " and " + woman.getFirstName() + " got married.");

        LOGGER.info(woman.getFirstName() + " " + woman.getPreviousLastName());

        woman.deregisterPartnership(true);
        LOGGER.info(woman.getFirstName() + " and her partner dissolved the partnership and she reverted to her previous last name.");
    }
}
