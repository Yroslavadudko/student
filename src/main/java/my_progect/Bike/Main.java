package lessons.lesson_5.home_work.mykola_dudko;
public class Main {
    public static void main(String[] args) {
        Bicycle raceBicycle = new Bicycle("BMC", "full-Carbon", "front suspension", "Cross-Country", 12, 29, "Pirelli", "Sram-Level");
        Bicycle driveBicycle = new Bicycle("Santa Cruz", "full-Carbon", "double suspension", "Down-Country", 12, 29, "Vittoria", "Sram-Level");
        Bicycle childrenBicycle = new Bicycle("Pride", "Aluminum", "non suspension", "walking", 1, 20, "Hooka", "V-Brakes");

        // Print Bicycle info
        System.out.println("\nBMC");
        printBikeInfo(raceBicycle);

        System.out.println("\nSanta Cruz");
        printBikeInfo(driveBicycle);

        System.out.println("\nPride");
        printBikeInfo(childrenBicycle);

        // Are bikes equal?
        boolean areEqual = raceBicycle.equals(driveBicycle);
        System.out.println("\nAre bikes equal?  " + areEqual);

        // breaking()
        System.out.println("\nBraking BMC:");
        raceBicycle.braking();

        System.out.println("\nBraking Santa Cruz:");
        driveBicycle.braking();

        System.out.println("\nBraking Pride:");
        childrenBicycle.braking();

        // We compare bicycles by ....
        compareBikeCharacteristics("Brand", raceBicycle.getBrand(), driveBicycle.getBrand());
        compareBikeCharacteristics("Brand", childrenBicycle.getBrand(), driveBicycle.getBrand());
        compareBikeCharacteristics("Brand", raceBicycle.getBrand(), childrenBicycle.getBrand());

        compareBikeCharacteristics("Frame", raceBicycle.getFrame(), driveBicycle.getFrame());
        compareBikeCharacteristics("Frame", childrenBicycle.getFrame(), driveBicycle.getFrame());
        compareBikeCharacteristics("Frame", raceBicycle.getFrame(), childrenBicycle.getFrame());

        compareBikeCharacteristics("Suspension", raceBicycle.getSuspension(), driveBicycle.getSuspension());
        compareBikeCharacteristics("Suspension", childrenBicycle.getSuspension(), driveBicycle.getSuspension());
        compareBikeCharacteristics("Suspension", raceBicycle.getSuspension(), childrenBicycle.getSuspension());

        compareBikeCharacteristics("Race Type", raceBicycle.getRaceType(), driveBicycle.getRaceType());
        compareBikeCharacteristics("Race Type", childrenBicycle.getRaceType(), driveBicycle.getRaceType());
        compareBikeCharacteristics("Race Type", raceBicycle.getRaceType(), childrenBicycle.getRaceType());

        compareBikeCharacteristics("Number of speeds", raceBicycle.getGearBox(), driveBicycle.getGearBox());
        compareBikeCharacteristics("Number of speeds", childrenBicycle.getGearBox(), driveBicycle.getGearBox());
        compareBikeCharacteristics("Number of speeds", raceBicycle.getGearBox(), childrenBicycle.getGearBox());

        compareBikeCharacteristics("Wheel size", raceBicycle.getWheelSize(), driveBicycle.getWheelSize());
        compareBikeCharacteristics("Wheel size", childrenBicycle.getWheelSize(), driveBicycle.getWheelSize());
        compareBikeCharacteristics("Wheel size", raceBicycle.getWheelSize(), childrenBicycle.getWheelSize());

        compareBikeCharacteristics("Tires", raceBicycle.getTires(), driveBicycle.getTires());
        compareBikeCharacteristics("Tires", childrenBicycle.getTires(), driveBicycle.getTires());
        compareBikeCharacteristics("Tires", raceBicycle.getTires(), childrenBicycle.getTires());

        compareBikeCharacteristics("Brakes", raceBicycle.getBrakes(), driveBicycle.getBrakes());
        compareBikeCharacteristics("Brakes", childrenBicycle.getBrakes(), driveBicycle.getBrakes());
        compareBikeCharacteristics("Brakes", raceBicycle.getBrakes(), childrenBicycle.getBrakes());
    }

    // Method for comparing
    private static void compareBikeCharacteristics(String characteristicName, String firstBikeValue, String secondBikeValue) {
        String result = String.format("'%s' and '%s' - %s: '%s' ", firstBikeValue, secondBikeValue, characteristicName, firstBikeValue.equalsIgnoreCase(secondBikeValue) ? "true" : "false");
        System.out.println(result);
    }
    private static void compareBikeCharacteristics(String characteristicName, int firstBikeValue, int secondBikeValue) {
        String result = String.format("'%d' and '%d' - %s: '%s' ", firstBikeValue, secondBikeValue, characteristicName, firstBikeValue==secondBikeValue ? "true" : "false");
        System.out.println(result);
    }

    // Method for outputting the description of the story
    private static void printBikeInfo(Bicycle bike) {
      String output = String.format(
                "Brand: %s\nFrame: %s\nSuspension: %s\nRace Type: %s\nGear Box: %d\nWheel Size: %d\nTires: %s\nBrakes: %s",
                bike.getBrand(), bike.getFrame(), bike.getSuspension(), bike.getRaceType(), bike.getGearBox(), bike.getWheelSize(), bike.getTires(), bike.getBrakes()
        );
        System.out.println(output);
    }
}
