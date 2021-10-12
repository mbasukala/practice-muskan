package com.musbas;

import java.util.Date;

public class Main {


    public static void main(String[] args) {
//        System.out.println(now);


        //Car class example

        Car ford = new Car();
        ford.setEngine("abc");
        ford.setDoors(4);
        ford.setTires(5);
        ford.setWindows(4);

        System.out.println(ford.getEngine());
//        System.out.println(ford.getTires());

        Car honda = new Car("xyz", null, 2, 2);
        honda.setTires(4);


        System.out.println(honda.getEngine() + " engine has " + honda.getDoors() + " doors.");
//        System.out.println(honda.getTires());

//        Person women = new Person();
//        women.setFirstName("asha");
//        women.setLastName("basukala");
//        women.setAge(55);
//        women.setAddress("672678 W Dolphin Street Mobile AL 36678");
//        women.setPhoneNumber(1_657_872_901);
//        System.out.println(women.getLastName());
//        System.out.println(women.getAge());
//
//        Address home = new Address ();
//        home.setStreetNumber(762);
//        home.setStreetName("Cardwell Circle");
//        home.setCity("Livonia");
//        home.setState("Michigan");
//        home.setAptNumber(71723);

        Person men = new Person("John", "Doe", 24,  9876543210L, "hdsfhdsk");
        System.out.println(men.getFirstName());
        System.out.println(men.getPhoneNumber());
        men.setPhoneNumber(327848723842L);
        System.out.println(men.getPhoneNumber());

//        System.out.println(women.getFirstName() + " visited " + home.getStreetNumber() + " " + home.getStreetName() + " " + home.getCity() + " " + home.getState() + " aptartment number " + home.getAptNumber() + ".");

        Students performance = new Students("Crish", "Brown", 'M',30, 3.8F);
        System.out.println(performance.getGender());
        System.out.println(performance.getGpa());
    }
}


