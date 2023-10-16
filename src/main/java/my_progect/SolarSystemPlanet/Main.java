package my_progect.SolarSystemPlanet;

public class Main {
    public static void main(String[] args) {
        // create an array of all the planets of the solar system
        SolarSystemPlanet[] planets = SolarSystemPlanet.values();

        // initialize the reference to the previous and next planet for each planet
        for (int i = 0; i < planets.length; i++) {
            SolarSystemPlanet previousPlanet = (i > 0) ? planets[i - 1] : null;
            SolarSystemPlanet nextPlanet = (i < planets.length - 1) ? planets[i + 1] : null;
            planets[i].setPreviousAndNextPlanets(previousPlanet, nextPlanet);
        }
        // display information about each planet
        for (SolarSystemPlanet planet : planets) {
            planet.printPlanetInfo();
        }
    }
}

