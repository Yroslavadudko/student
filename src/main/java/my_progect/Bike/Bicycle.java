package lessons.lesson_5.home_work.mykola_dudko;

import java.util.Objects;

public class Bicycle {
    String brand;
    String frame;
    String suspension;
    String raceType;
    int gearBox;
    int wheelSize;
    String tires;
    String brakes;
    public Bicycle(String brand, String frame, String suspension, String raceType, int gearBox, int wheelSize, String tires, String brakes) {
        this.brand = brand;
        this.frame = frame;
        this.suspension = suspension;
        this.raceType = raceType;
        this.gearBox = gearBox;
        this.wheelSize = wheelSize;
        this.tires = tires;
        this.brakes = brakes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Bicycle))
            return false;
        Bicycle bike = (Bicycle) o;
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

    public void braking() {
        System.out.println("The bicycle is braking.");
    }

    public String getBrand() {
        return brand;
    }

    public String getFrame() {
        return frame;
    }

    public String getSuspension() {
        return suspension;
    }

    public String getRaceType() {
        return raceType;
    }

    public int getGearBox() {
        return gearBox;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public String getTires() {
        return tires;
    }

    public String getBrakes() {
        return brakes;
    }
}


