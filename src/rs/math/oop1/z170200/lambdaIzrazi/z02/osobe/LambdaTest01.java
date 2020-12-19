package rs.math.oop1.z170200.lambdaIzrazi.z02.osobe;

import java.util.List;

public class LambdaTest01 {
    static void printPersonsOlderThan(List<Person> ljudi, int age) {
        for (Person p : ljudi) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    static void printPersonsWithinAgeRange(List<Person> roster, int ageLow, int ageHigh) {
        for (Person p : roster) {
            if (p.getAge() >= ageLow && p.getAge() <= ageHigh) {
                p.printPerson();
            }
        }
    }

    static void printPersonsWhereEmailContains(
            List<Person> roster, String partOfEmailAddress) {
        for (Person p : roster) {
            if (p.emailAddress.indexOf(partOfEmailAddress) >= 0) {
                p.printPerson();
            }
        }
    }

    static void printFemalePersonsWhereEmailContains(
            List<Person> roster, String partOfEmailAddress) {
        for (Person p : roster) {
            if (p.emailAddress.indexOf(partOfEmailAddress) >= 0
                    && p.gender == Person.Sex.FEMALE) {
                p.printPerson();
            }
        }
    }


    public static void main(String[] args) {
        printPersonsOlderThan(Person.OSOBE, 50);
        System.out.println();
        printPersonsOlderThan(Person.OSOBE, 80);
        System.out.println();
        printPersonsWithinAgeRange(Person.OSOBE, 80, 85);
        System.out.println();
        printPersonsWhereEmailContains(Person.OSOBE, "disney");
        System.out.println();
        printFemalePersonsWhereEmailContains(Person.OSOBE, "disney");

    }

}
