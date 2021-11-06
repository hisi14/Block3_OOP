package org.campus02.lahovnik.person;

import org.campus02.lahovnik.person.Person;

public class PersonDemo2App {

    public static void main(String[] args) {

        Person a123 = new Person();
        Person max = new Person();

        a123.firstname = "Susi";
        a123.lastname = "Sorglos";
        a123.age = 30;
        a123.height = 177;

        max.firstname = "Max";
        max.lastname = "Mustermann";

        //System.out.println(a123.firstname + " " + a123.lastname + ", " + a123.age + " Jahre");
        //System.out.println(max.lastname + " " + max.firstname + ", " + max.age + " Jahre");

        //printPerson(a123);
        //printPerson(max);

        a123.print();
        max.print();
    }

    public static void printPerson(Person p) {
        System.out.println(p.firstname + " " + p.lastname + ", " + p.age + " Jahre");
    }
}
