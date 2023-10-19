package lessons.lesson_15.home_work.mykola_dudko;

public class Woman extends Person{

    public Woman(String firstName, String lastName, int age, Person partner, String previousLastName) {
        super(firstName, lastName, age, partner, previousLastName);
    }

    @Override
    public boolean isRetired(){
        return getAge() >= 60; //retirement age for women
    }
}
