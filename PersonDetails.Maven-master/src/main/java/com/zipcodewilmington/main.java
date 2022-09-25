package com.zipcodewilmington;

public class main {
    public static void main(String[] args) {
        Person person = new Person("Shawn", "Boodhoo");
        Person person1 = new Person("Ryan", "Boodhoo");

        Person[] names = new Person[2];

        names[0] = person;
        names[1] = person1;

        PersonHandler peoples = new PersonHandler(names);

        System.out.println(peoples.forLoop());
        System.out.println(peoples.whileLoop());
        System.out.println(peoples.forEachLoop());
    }
}
