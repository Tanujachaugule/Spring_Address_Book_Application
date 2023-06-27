package com.bridgelabz.addressbookapplication.dto;

public class AddressBookDTO {
    public String firstName;
    public String lastName;
    public String mobileNo;

    public AddressBookDTO(String firstName, String lastName, String mobileNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
