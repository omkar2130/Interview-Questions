package org.example;


import java.util.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Person) && ((Person) obj).name.equals(this.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name); // or name.hashCode()
    }

    // hashCode() is NOT overridden!
}

public class Main {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();

        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice");

        map.put(p1, "Developer");
        System.out.println(map.size()); // ❌ null, even though p1.equals(p2) is true

        for(Map.Entry<Person,String> m : map.entrySet()) {
            System.out.println(m.getKey()+"  "+m.getValue());
        }

        System.out.println(map.get(p1)); // ❌ null, even though p1.equals(p2) is true
    }
}
