package com.Ronak;
class Student
{
	
	   int rollno;
	   String name;  
	   static String college ="LJ";       //static variable  
    
   Student(int r, String n)
   {  
		   rollno = r;  
		   name = n;  
   }  
   
   void display ()
   {
	   System.out.println(rollno+" "+name+" "+college);
   }  
}  
  class static_variable{  
	  
    public static void main(String args[]) 
 {
	 
	 	Student s1 = new Student(101,"Khushi");  
 Student s2 = new Student(102,"Aarya");  
 
 s1.display();  
 s2.display();
  }  
}