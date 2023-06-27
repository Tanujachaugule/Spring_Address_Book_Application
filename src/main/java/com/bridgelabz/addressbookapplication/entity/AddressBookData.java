package com.bridgelabz.addressbookapplication.entity;

import com.bridgelabz.addressbookapplication.dto.AddressBookDTO;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name="AddressBook")

public class AddressBookData {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int personId;
    private String firstName;
    private String lastName;
    private String mobileNo;

    public AddressBookData(int personId, AddressBookDTO addressBookDTO) {
        this.personId = personId;
        this.firstName = addressBookDTO.firstName;
        this.lastName = addressBookDTO.lastName;
        this.mobileNo = addressBookDTO.mobileNo;
    }

    public AddressBookData() { }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
