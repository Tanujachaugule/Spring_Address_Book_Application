package com.bridgelabz.addressbookapplication.entity;

import com.bridgelabz.addressbookapplication.dto.AddressBookDTO;
import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name="AddressBook")

public @Data class AddressBookData {
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

    public AddressBookData(){
    }
}
