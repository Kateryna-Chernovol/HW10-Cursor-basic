package com.cursor.hw10;

import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Set<Person> adultPersons = personsDatabase();

        adultPersons
                .stream()
                .filter(x -> x.getAge() >= 18)
                .filter(x -> x.getAge() < 60)
                .map(person -> person.getName() + " - " + person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    private static Set<Person> personsDatabase() {
        return Set.of(
                new Person("Emily", 15, Gender.FEMALE),
                new Person("Merry", 25, Gender.FEMALE),
                new Person("Brandon", 17, Gender.MALE),
                new Person("David", 51, Gender.MALE),
                new Person("Bellatrix", 70, Gender.MALE),
                new Person("Tomas", 81, Gender.MALE),
                new Person("Newton", 18, Gender.MALE),
                new Person("Alicia", 21, Gender.FEMALE)
        );
    }
}

