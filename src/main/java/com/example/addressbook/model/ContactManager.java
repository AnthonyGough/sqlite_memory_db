package com.example.addressbook.model;

import java.util.List;

public class ContactManager {
    private IContactDAO contactDAO;
    public ContactManager(IContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }

    public List<Contact> searchContacts(String query) {
        return contactDAO.getAllContacts();
    }

    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }
}