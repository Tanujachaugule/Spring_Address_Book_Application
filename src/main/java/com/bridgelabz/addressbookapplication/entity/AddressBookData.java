package com.bridgelabz.addressbookapplication.entity;

import com.bridgelabz.addressbookapplication.dto.AddressBookDTO;
import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name="AddressBook")

public @Data class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private int personId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipNo;
    private String mobileNo;
    private String emailId;

    public AddressBookData() {
    }

    public AddressBookData(int personId, AddressBookDTO addressBookDTO) {
        this.personId = personId;
        this.firstName = addressBookDTO.firstName;
        this.lastName = addressBookDTO.lastName;
        this.address = addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zipNo = addressBookDTO.zipNo;
        this.mobileNo = addressBookDTO.mobileNo;
        this.emailId = addressBookDTO.emailId;
    }
}