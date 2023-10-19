package my_progect.Person;

public class Woman extends lessons.lesson_15.home_work.mykola_dudko.Person {

    public Woman(String firstName, String lastName, int age, lessons.lesson_15.home_work.mykola_dudko.Person partner, String previousLastName) {
        super(firstName, lastName, age, partner, previousLastName);
    }

    @Override
    public boolean isRetired(){
        return getAge() >= 60; //retirement age for women
    }
}
