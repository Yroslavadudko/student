package lessons.lesson_5.home_work.mykola_dudko;

import java.util.Objects;

public class Bike {
    private String brand;
    private String frame;
    private String suspension;
    private String raceType;
    private int gearBox;
    private int wheelSize;
    private String tires;
    private String brakes;

    public Bike(String brand, String frame, String suspension, String raceType, int gearBox, int wheelSize, String tires, String brakes) {
        this.brand = brand;
        this.frame = frame;
        this.suspension = suspension;
        this.raceType = raceType;
        this.gearBox = gearBox;
        this.wheelSize = wheelSize;
        this.tires = tires;
        this.brakes = brakes;
    }

    public String getBrand() {
        return brand;
    }
    public String printFrame() {
        System.out.println(this.frame);
        return frame;
    }
    public String printSuspension(){
        System.out.println(this.suspension);
        return this.suspension;
    }
    public String getRaceType() {
        return raceType;
    }
    public int printGearBox() {
        System.out.println(this.gearBox);
        return gearBox;
    }
    public int printWheelSize() {
        System.out.println(this.wheelSize);
        return  wheelSize;
    }
    public String getTires() {
        System.out.println(this.tires);
        return tires;
    }
    public String getBrakes() {
        System.out.println(this.brakes);
        return brakes;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Bike))
            return false;
        Bike bike = (Bike) o;
            return
        gearBox == bike.gearBox &&

        wheelSize == bike.wheelSize &&
        Objects.equals(brand, bike.brand) &&
        Objects.equals(frame, bike.frame) &&
        Objects.equals(suspension, bike.suspension) &&
        Objects.equals(raceType, bike.raceType) &&
        Objects.equals(tires, bike.tires) &&
        Objects.equals(brakes, bike.brakes);
    }

}
