package org.example.recordClassDemo;

public record Employee(int id, String name, String department) {

    // Record classes are implicitly final, so no need to declare it as final
    // They also automatically provide equals(), hashCode(), and toString() methods
    // No need for explicit getters; fields can be accessed directly using id(), name(), and department() methods

    // Example of a method in a record class
   public String getDetails() {
        return "Employee ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}
