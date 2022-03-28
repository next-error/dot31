package com.doit.Equaals;

import java.util.Objects;

public class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals (Object obj ) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if
        (!(obj instanceof Person)) {
            return false;
        }
        Person p = (Person) obj;
        if(!(p.age==this.age)){
            return false;
        }
        if(!(p.name.equals (this.name))){
            return false;
        }
        return true;
    }







/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }*/
}
