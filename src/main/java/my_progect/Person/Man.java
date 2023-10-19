package lessons.lesson_15.home_work.mykola_dudko;

public class Man extends Person{

    public Man(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner, null);
    }

    @Override
    public boolean isRetired(){
        return getAge() >= 65; //retirement age for men
    }

}
