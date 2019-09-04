package designpatterns.creationalpatterns.c02_builder;

import java.awt.*;

public class Bedroom {
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    private Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows,
                    int numberOfDoors, boolean isDouble, boolean hasEnsuite){
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;
    }

    public static Bedroom createBedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows,
                                        int numberOfDoors, boolean isDouble, boolean hasEnsuite) {
        return new Bedroom(dimensions, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors, isDouble, hasEnsuite);
    }



}
