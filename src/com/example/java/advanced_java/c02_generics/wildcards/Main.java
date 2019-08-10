package com.example.java.advanced_java.c02_generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Building> buildingList = new ArrayList<>();
        buildingList.add(new Building());
        buildingList.add(new Building());
        buildingList.add(new Building());

        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office());
        officeList.add(new Office());
        officeList.add(new Office());

        List<House> houseList = new ArrayList<>();
        houseList.add(new House());
        houseList.add(new House());
        houseList.add(new House());

        printBuildings(buildingList);
        printBuildings(officeList);
        printBuildings(houseList);

        addHouse(buildingList);
        addHouse(houseList);
//        addHouse(officeList);
    }

//    private static <T extends Building> void printBuildings(List<T> buildings) {
//        for (T building : buildings) {
//            System.out.println(building);
//        }
//    }
//
    private static void printBuildings(List<? extends Building> buildings) {
        for (int i = 0; i < buildings.size() - 1; i++) {
            System.out.println(buildings.get(i));
        }
    }

    private static void addHouse(List<? super House> building) {
        building.add(new House());
        System.out.println("House is added to: " + building);
    }
}
