package com.bridgelabz;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class AddressBook implements UsingInterfaceInAddressBook{

    ArrayList <ContactsInAddressBook> contactList = new ArrayList<ContactsInAddressBook>();

    @Override
    public void addContact(ContactsInAddressBook person) {
        contactList.add(person);

    }

    @Override
    public void displayContents() {

        Iterator<ContactsInAddressBook> iterator = contactList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}

