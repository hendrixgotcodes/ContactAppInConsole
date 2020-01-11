package com.company;

import java.util.ArrayList;
import java.util.Scanner;

//Store
//Modify
//Remove
//Query
public class Phone
{
    public ArrayList<Contact> getContacts() {
        return Contacts;
    }

    private static Scanner scanner = new Scanner(System.in);

    private ArrayList<Contact> Contacts = new ArrayList<>();


    public void Store(Contact cont)
    {

        Contacts.add(cont);
        System.out.println("Contact added successfully.");

    }
    public void Modify(String oldieName, Contact newbie)
    {
        int position = -1;
       for (int i = 0; i < Contacts.size(); i++)
       {
           Contact con = Contacts.get(i);
           if (con.getName().equalsIgnoreCase(oldieName))
           {
               position = i;
           }

       }

       if (position >= 0)
       {
           Contacts.set(position, newbie);
           System.out.println("Contact changed from "+ oldieName + " to "+ newbie.getName() + ".");
       }

    }
    public void Remove(String contactName)
    {
        if (findContact(contactName)>=0)
        {
            Contacts.remove(findContact(contactName));
            System.out.println("Contact successfully deleted.");
        }

    }
    public void find(String name)
    {
        if (findContact(name) >=0)
        {
            Contact con = Contacts.get(findContact(name));
            System.out.println(con.getName() + "\t" + con.getPhone());
        }
    }
    private int findContact(String name)
    {
        for (int i = 0; i < Contacts.size(); i++)
        {
            Contact cont = Contacts.get(i);
            if (cont.getName().equalsIgnoreCase(name))
            {
                return i;
            }
        }
        return -1;
    }
    public boolean Contains(String name)
    {
        boolean sth = false;
        for(Contact con : Contacts)
        {
            if (con.getName().equalsIgnoreCase(name))
            {
               sth = true;
            }
        }
        return sth;
    }

}
