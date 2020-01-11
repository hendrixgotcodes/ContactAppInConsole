package com.company;

import java.util.ArrayList;

//Store
//Modify
//Remove
//Query
public class Contact
{
    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    private String Name;
    private String Phone;

   public Contact(String Name, String Phone)
   {
       this.Name = Name;
       this.Phone = Phone;
   }

}
