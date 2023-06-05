package com.Ronak;

public class Student1 {

	public static void main(String[] args) {
		
        
        Manager m = new Manager();
        m.name = "meet";
        m.age = 22;
        m.phoneNumber = "9876543210";
        m.address = "Ahmedabad";
        m.salary = 80000.0;
        m.specialization = "java development";
        m.department = "IT";
        
   
        
        System.out.println("Manager Details:");
        System.out.println("Name: " + m.name);
        System.out.println("Age: " + m.age);
        System.out.println("Phone Number: " + m.phoneNumber);
        System.out.println("Address: " + m.address);
        m.printSalary();
        System.out.println("Specialization: " + m.specialization);
        System.out.println("Department: " + m.department);

	}

}
