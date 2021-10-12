package com.musbas;

public class Person {
    // instance variables or properties or members variables
    private String firstName;
    private String lastName;
    private int age;
    private long phoneNumber;
    private String address;
    
    public Person (String firstName, String lastName, int age, long phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
public Person() {

}
    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public long getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public Address createAddress(){
        Address address = new Address();
        return address;
    }

}
