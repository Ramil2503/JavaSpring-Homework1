package org.example.application;

import com.google.gson.Gson;

import org.example.domain.Person;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Person person1 = new Person("John", "Wick", 35);
        Person person2 = new Person("Will", "Smith", 40);
        Person person3 = new Person("John", "Wick", 35);
        Person person4 = new Person("John", "Wick", 35);

        System.out.println("SERIALIZATION");
        String json = gson.toJson(person1);
        System.out.println("Serialized to Json person 1: " + json);
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Deserialized from Json person 1: " + deserializedPerson);

        System.out.println("\nTO STRING()");
        System.out.println("To String of person 2: " + person2);

        System.out.println("\nHASH CODE()");
        System.out.println("Hash Code of person 1: " + person1.hashCode());
        System.out.println("Hash Code of person 3: " + person3.hashCode());
        System.out.println("Hash Code of person 2: " + person2.hashCode());

        System.out.println("\nEQUALS()");
        System.out.println(person3.equals(person4));
        System.out.println(person1.equals(person2));
    }
}
