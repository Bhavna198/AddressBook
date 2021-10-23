package com.bridgelabz;

public class ContactsInAddressBook {

    private String firstName, lastName, email;
    private long phoneNumber;
    private AddressBookMain address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public AddressBookMain getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(AddressBookMain address) {
        this.address = address;
    }

    @Override
    public String toString() {

        return "Person Details:\nFirst Name - " + firstName + "\nLast Name - " + lastName + "\nPhone Number - " + phoneNumber + "\nEmail - " + email + "\nAddress - " + address;
    }
}

