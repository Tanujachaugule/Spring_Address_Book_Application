package com.bridgelabz.addressbookapplication.service;

import com.bridgelabz.addressbookapplication.dto.AddressBookDTO;
import com.bridgelabz.addressbookapplication.entity.AddressBookData;
import com.bridgelabz.addressbookapplication.exception.AddressBookException;
import com.bridgelabz.addressbookapplication.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class AddressBookService implements IAddressBookService{
    @Autowired
    private AddressBookRepository addressBookRepository;

    private List<AddressBookData> contactList = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressBookData() {
        return contactList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        return contactList.stream()
                .filter(contact -> contact.getPersonId() == personId)
                .findFirst()
                .orElseThrow(() -> new AddressBookException("Person Not Found"));
    }

    @Override
    public AddressBookData addNewContact(AddressBookDTO addressBookDTO) {
        AddressBookData contact = null;
        contact = new AddressBookData(contactList.size()+1, addressBookDTO);
        log.debug("Contact Details: "+contact.toString());
        contactList.add(contact);
        return addressBookRepository.save(contact);
    }

    @Override
    public AddressBookData updateContact(int personId, AddressBookDTO addressBookDTO) {
        AddressBookData contact = this.getAddressBookDataById(personId);
        contact.setFirstName(addressBookDTO.firstName);
        contact.setLastName(addressBookDTO.lastName);
        contact.setAddress(addressBookDTO.address);
        contact.setAddress(addressBookDTO.mobileNo);
        contactList.set(personId-1, contact);
        return contact;
    }

    @Override
    public void deleteContact(int personId) {
        contactList.remove(personId-1);
    }
}