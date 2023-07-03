package com.bridgelabz.addressbookapplication.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid First Name")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid Last Name")
    public String lastName;
    @NotEmpty(message = "Address Field cannot be empty")
    public String address;
    @Size(max = 10, min = 10, message = "Please Enter a valid phone number")
    @NotEmpty(message = "Mobile Number Field cannot be empty")
    public String mobileNo;
    @NotEmpty(message = "City Field cannot be empty")
    public String city;
    @NotEmpty(message = "State Field cannot be empty")
    public String state;
    @NotEmpty(message = "Zip No Field cannot be empty")
    public String zipNo;
    @NotEmpty(message = "Email id Field cannot be empty")
    public String emailId;


    public AddressBookDTO(String firstName, String lastName, String address, String mobileNo, String city, String state, String zipNo, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobileNo = mobileNo;
        this.city = city;
        this.state = state;
        this.zipNo = zipNo;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipNo='" + zipNo + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
