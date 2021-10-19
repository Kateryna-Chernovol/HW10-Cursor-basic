package com.cursor.hw10;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return "Person: " +
                "name " + name + ' ' +
                ", age " + age +
                ", gender " + gender +
                ' ';
    }
}
/**
 * Using Stream API build Stream with
 * a sequence of objects that represent
 * a person (with fields: name, age, gender (enum)).
 * <p>
 * By a chain of operations do:
 * return only people are adult (age >= 18)
 * and not retired (age < 60);
 * <p>
 * return Set of strings that contains name
 * and gender in the format: {name} - {gender}. For example:
 * Petro - m
 * Olena - f
 */
