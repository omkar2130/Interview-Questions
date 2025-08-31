package org.example.recordClassDemo;

public class Demo {


        // Main driver method
        public static void main(String args[]) {

            // Creating object with default constructor
            Employee e1 = new Employee(1001, "omkar", "CRM");

            // Auto generated getter methods
            System.out.println(e1.id() + " " + e1.name() + " " + e1.department());

            // Auto-generated toString() method
            System.out.println(e1.toString());

            System.out.println(e1.getDetails());
        }
    }
