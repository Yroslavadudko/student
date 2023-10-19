package my_progect.Person;

public class Man extends lessons.lesson_15.home_work.mykola_dudko.Person {

    public Man(String firstName, String lastName, int age, lessons.lesson_15.home_work.mykola_dudko.Person partner) {
        super(firstName, lastName, age, partner, null);
    }

    @Override
    public boolean isRetired(){
        return getAge() >= 65; //retirement age for men
    }

}
