package my_progect.SolarSystemPlanet;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public enum SolarSystemPlanet {
    MERCURY(1, 0, 57.9, 2439.7),
    VENUS(2, 57.9, 108.2, 6051.8),
    EARTH(3, 108.2, 149.6, 6371.0, Moon.THE_MOON),
    MARS(4, 149.6, 227.9, 3389.5, Moon.PHOBOS, Moon.DEIMOS),
    JUPITER(5, 227.9, 778.5, 69911, Moon.IO, Moon.EUROPA, Moon.GANYMEDE, Moon.CALLISTO),
    SATURN(6, 778.5, 1433.4, 58232, Moon.MIMAS, Moon.ENCELADUS, Moon.TETHYS, Moon.DIONE, Moon.RHEA, Moon.TITAN),
    URANUS(7, 1433.4, 2872.5, 25362, Moon.MIRANDA, Moon.ARIEL, Moon.URANUS_UMBRIEL, Moon.TITANIA, Moon.OBERON),
    NEPTUNE(8, 2872.5, 4495.1, 24622, Moon.TRITON);

    @Getter
    private final int orderFromSun;
    @Getter
    private final double distanceFromPrevious;
    private final double distanceFromSun;
    @Getter
    private final double radius;
    private final List<Moon> moons;
    @Getter
    private SolarSystemPlanet previousPlanet;
    @Getter
    private SolarSystemPlanet nextPlanet;

    SolarSystemPlanet(int orderFromSun, double distanceFromPrevious, double distanceFromSun, double radius, Moon... moons) {
        this.orderFromSun = orderFromSun;
        this.distanceFromPrevious = distanceFromPrevious;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.moons = new ArrayList<>();
        for (Moon moon : moons) {
            this.moons.add(moon);
            moon.setOrbitsPlanet(this);
        }
    }

    public double getDistanceFromSun() {
        if (previousPlanet != null) {
            return previousPlanet.getDistanceFromSun() + distanceFromSun;
        } else {
            return distanceFromSun;
        }
    }

    public void setPreviousAndNextPlanets(SolarSystemPlanet previousPlanet, SolarSystemPlanet nextPlanet) {
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
    }
    // initialize the reference to the previous and next planet
    static {
        MERCURY.setPreviousAndNextPlanets(null, VENUS);
        VENUS.setPreviousAndNextPlanets(MERCURY, EARTH);
        EARTH.setPreviousAndNextPlanets(VENUS, MARS);
        MARS.setPreviousAndNextPlanets(EARTH, JUPITER);
        JUPITER.setPreviousAndNextPlanets(MARS, SATURN);
        SATURN.setPreviousAndNextPlanets(JUPITER, URANUS);
        URANUS.setPreviousAndNextPlanets(SATURN, NEPTUNE);
        NEPTUNE.setPreviousAndNextPlanets(URANUS, null);
    }
    public void printPlanetInfo() {
        out.println("Planet: " + this.name());
        out.println("Serial number from the Sun: " + getOrderFromSun());
        out.println("Distance from previous planet: " + getDistanceFromPrevious() + " million km");
        out.println("Distance from the Sun: " + getDistanceFromSun() + " million km");
        out.println("Radius: " + getRadius() + " km");
        out.println("Satellite: ");
        for (Moon moon : moons) {
            out.println("  - " + moon.name());
        }
        out.println("Previous planet: " + (getPreviousPlanet() != null ? getPreviousPlanet().name() : "not"));
        out.println("Next planet: " + (getNextPlanet() != null ? getNextPlanet().name() : "not"));
        out.println();
    }
    public enum Moon {
        THE_MOON, PHOBOS, DEIMOS, IO, EUROPA, GANYMEDE, CALLISTO,
        MIMAS, ENCELADUS, TETHYS, DIONE, RHEA, TITAN,
        MIRANDA, ARIEL, URANUS_UMBRIEL, TITANIA, OBERON, TRITON;
        private SolarSystemPlanet orbitsPlanet;
        public void setOrbitsPlanet(SolarSystemPlanet planet) {
            orbitsPlanet = planet;
        }
    }
}