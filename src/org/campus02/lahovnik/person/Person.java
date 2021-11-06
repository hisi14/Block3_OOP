package org.campus02.lahovnik.person;

public class Person {
    public String firstname;
    public String lastname;
    public int age;
    public int height;

    public void print() {
        System.out.println(firstname + " " + lastname + ", " + age + " Jahre, " + height + "cm");
    }
}
