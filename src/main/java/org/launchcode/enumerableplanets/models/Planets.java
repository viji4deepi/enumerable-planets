package org.launchcode.enumerableplanets.models;

public enum Planets {
    // list the planets here.
     MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);
    // Don't forget to capitalization convention and enum
    // syntax to separate value and end the list

    private final String name;
    private final int yearLength;

    Planets(String displayName, int yearLength) {
        this.name = displayName;
        this.yearLength = yearLength;
    }

    public int getYearLength() {
        return yearLength;
    }

    public String getDisplayName() {
        return name;
    }
}
