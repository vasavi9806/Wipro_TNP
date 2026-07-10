package com.automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestVehicle {
    public static void main(String[] args) {
        // Test Hero Class
        System.out.println("--- Testing Hero ---");
        Hero heroBike = new Hero("Hero Splendor", "KA-01-HE-1234", "Amit Sharma", 60);
        System.out.println("Model: " + heroBike.getModelName());
        System.out.println("Reg No: " + heroBike.getRegistrationNumber());
        System.out.println("Owner: " + heroBike.getOwnerName());
        System.out.println("Current Speed: " + heroBike.getSpeed() + " km/h");
        heroBike.radio();

        System.out.println();

        // Test Honda Class
        System.out.println("--- Testing Honda ---");
        Honda hondaBike = new Honda("Honda Activa", "MH-12-HO-5678", "Priya Patel", 50);
        System.out.println("Model: " + hondaBike.getModelName());
        System.out.println("Reg No: " + hondaBike.getRegistrationNumber());
        System.out.println("Owner: " + hondaBike.getOwnerName());
        System.out.println("Current Speed: " + hondaBike.getSpeed() + " km/h");
        hondaBike.cdplayer();
    }
}