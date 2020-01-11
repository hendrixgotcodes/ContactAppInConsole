package com.company;

import java.util.Scanner;
//Store
//Modify
//Remove
//Query
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    static Phone phone = new Phone();
    public static void main(String[] args) {



        boolean quit = false;
        int option = -1;


        while (!quit)
        {
            optionsToSelect();
            System.out.println("Enter your option.");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option)
            {
                case 1:
                    store();
                    break;
                case 2:
                    modify();
                    break;
                case 3:
                    Remove();
                    break;
                case 4:
                    query();
                    break;
                case 5:
                    list();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }


    }
    private static void store()
    {
        System.out.println("Please enter name.");
        String name = scanner.next();

        if(phone.Contains(name))
        {
            System.out.println("Sorry contact exists with such name.");
            return;
        }

        scanner.nextLine();

        System.out.println("Please enter phone.");
        String number = scanner.next();

        scanner.nextLine();

        Contact con = new Contact(name, number);

        phone.Store(con);

        System.out.println("Press any key then enter key to continue");
        String continu = scanner.next();
        return;
    }
    private static void modify()
    {
        System.out.println("Enter the name of contact you want to modify");
        String mod = scanner.next();

        if (!phone.Contains(mod))
        {
            System.out.println("Sorry. No such name found in contacts.");
            return;
        }

        scanner.nextLine();

        System.out.println("Please enter new name.");
        String name = scanner.next();

        scanner.nextLine();

        System.out.println("Please enter new phone.");
        String number = scanner.next();

        scanner.nextLine();

        Contact con = new Contact(name, number);

        phone.Modify(mod,con);

        System.out.println("Press any key then enter key to continue");
        String continu = scanner.next();
        return;
    }
    private static void Remove()
    {
        System.out.println("Enter name of contact you want to remove.");
        String remove = scanner.next();

        scanner.nextLine();

        phone.Remove(remove);

        System.out.println("Press any key then enter key to continue");
        String continu = scanner.next();
        return;

    }
    private static void query()
    {
        System.out.println("Enter name of contact to search.");
        String search = scanner.next();

        phone.find(search);

        System.out.println("Press any key then enter key to continue");
        String continu = scanner.next();
        return;
    }
    private static void list()
    {
        for(Contact contact : phone.getContacts())
        {
            System.out.println(contact.getName() + "\t" + contact.getPhone());
        }
        System.out.println("Press any key then enter key to continue");
        String continu = scanner.next();
        return;

    }
    private static void optionsToSelect()
    {
        System.out.println("Press:");
        System.out.println("\t 1 - To store a contact.");
        System.out.println("\t 2 - To modify a contact.");
        System.out.println("\t 3 - To delete a contact.");
        System.out.println("\t 4 - To search a contact.");
        System.out.println("\t 5 - To list all contacts.");
        System.out.println("\t 6 - To quit.");
    }
}
