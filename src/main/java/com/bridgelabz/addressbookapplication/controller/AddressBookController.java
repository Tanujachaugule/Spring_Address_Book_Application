package com.bridgelabz.addressbookapplication.controller;

import com.bridgelabz.addressbookapplication.dto.AddressBookDTO;
import com.bridgelabz.addressbookapplication.dto.ResponseDTO;
import com.bridgelabz.addressbookapplication.entity.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookapplication")
public class AddressBookController {
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData personData = null;
        personData = new AddressBookData(1, new AddressBookDTO
                ("Tanuja", "Chaugule", "1234567890"));

        ResponseDTO responseDTO = new ResponseDTO("Get Call Successful", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }


    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int personId) {
        AddressBookData personData = null;
        personData = new AddressBookData(1, new AddressBookDTO
                ("Avinash", "Patil", "1234567890"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call For ID Successful", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }


    @PostMapping("/addnew")
    public ResponseEntity<ResponseDTO> addNewContact(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData personData = null;
        personData = new AddressBookData(1,addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("New Contact Added Sucessfully", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }


    @PutMapping("/updatecontact")
    public ResponseEntity<ResponseDTO> updateContact(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData personData = null;
        personData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Contact Updated Sucessfully", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteContact(@PathVariable("personId") int personId) {
        ResponseDTO responseDTO = new ResponseDTO("Deleted Contact Sucessfully", "Deleted Id: "+ personId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
