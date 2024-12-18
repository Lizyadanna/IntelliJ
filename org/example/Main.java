package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       String name = new String("Amigoscode");

       Person sibling1 = new Person("Lizy", 30);
       Person sibling2 = new Person("George", 28);
       Person sibling3 = new Person("Prince", 28);
       Person sibling4 = new Person("Cindy", 21);
       Person sibling5 = new Person("Bryant", 16);
       Person firstDaughter = sibling1;

       //Before changing sibling1
        System.out.println(sibling1.name + firstDaughter.name);

        sibling1.name = "Lizyboo";

        //After changing sibling1
        System.out.println(sibling1.name + firstDaughter.name);

        firstDaughter.name = "Booboo";

        //After changing first daughter name
        System.out.println(sibling1.name + firstDaughter.name);

        //This shows the difference with primitive variable types and reference types



    }

    static class Person{
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age= age;
        }
        Person(String name) {
            this.name = name;
        }
    }
}