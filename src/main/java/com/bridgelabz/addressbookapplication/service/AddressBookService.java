package com.bridgelabz.addressbookapplication.service;

import com.bridgelabz.addressbookapplication.dto.AddressBookDTO;
import com.bridgelabz.addressbookapplication.entity.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class AddressBookService implements IAddressBookService{
    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> contactList = new ArrayList<>();
        contactList.add(new AddressBookData(1, new AddressBookDTO("Saloni",
                "Jadhav", "9797979797")));
        return contactList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        AddressBookData contact = null;
        contact = new AddressBookData(1, new AddressBookDTO("Tanmay",
                "Chaugule", "9879879879"));
        return contact;
    }

    @Override
    public AddressBookData addNewContact(AddressBookDTO addressBookDTO) {
        AddressBookData contact = null;
        contact = new AddressBookData(1, addressBookDTO);
        return contact;
    }

    @Override
    public AddressBookData updateContact(AddressBookDTO addressBookDTO) {
        AddressBookData contact = null;
        contact = new AddressBookData(1, addressBookDTO);
        return contact;
    }

    @Override
    public void deleteContact(int personId) {

    }
}
