package model;

import java.time.LocalDate;

public class User {
    public String firstName;
    public String lastName;
    public String mobileNumber;
    public String address;
    public LocalDate registerDate;

    public User(String firstName, String lastName, String mobileNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }
}