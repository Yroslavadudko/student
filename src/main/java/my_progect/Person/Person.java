package lessons.lesson_15.home_work.mykola_dudko;


import lombok.Getter;

@Getter
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;
    private String previousLastName;

    public Person(String firstName, String lastName, int age, Person partner, String previousLastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
        this.previousLastName = previousLastName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected void setPartner(Person partner) {
        this.partner = partner;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isRetired(){
        return age >= 65; //retirement age for men
    }

    public void registerPartnership(Person partner) {

        if (partner != null) {
            String previousLastNamePartner = partner.getLastName();
            partner.setLastName(this.lastName);
            this.setLastName(previousLastNamePartner);

            this.partner = partner;
            partner.partner = this;
        }
    }
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (partner != null) {
            if (returnToPreviousLastName) {
                partner.setLastName(previousLastName);
            }
            partner.partner = null;
            partner = null;
        }
    }
}
