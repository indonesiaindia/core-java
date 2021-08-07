//employee full name Sushil Kumar
//employee annual package 540006.96
//employee full name Tara Sharma
//employee annual package 612011.88
/*Abstraction
Description
Create a class Employee that consists of the 
following details of the employee:
Employee ID
Employee First Name
Employee Last Name.
Employee monthly pay.
Create two objects of Employee 
class E1 and E2 and pass the details of 
two employees 
as: {101512031, Sushil, Kumar, 45000.58} 
and {101512032, Tara, Sharma,51000.99} in
the main class i.e. Source. Print the full 
name and annual income of both the employees.

Output: The output should be in the 
following format: 
employee full name Sushil Kumar                                                                                    
employee annual package 540006.96
employee full name Tara Sharma                                                                                    
employee annual package 612011.88*/
class Employee 
{
private int empId;
private String empFirstName;
private String empSecondName;
private double empSalary;
//Write your code here
public Employee(int empId,String empFirstName,String empSecondName,double empSalary)
{
this.empId=empId;//constructor
this.empFirstName=empFirstName;
this.empSecondName=empSecondName;
this.empSalary=empSalary;
}
public void displayfullname()//method 
{
System.out.println("employee full name"+" "+this.empFirstName+" "+this.empSecondName);
}
public double annualsalary()//method
{
return this.empSalary*12;
}
}
public class Guts 
{
public static void main(String[] args) 
{
//Write your code here
Employee E1= new  Employee (101512031, "Sushil", "Kumar", 45000.58);
E1.displayfullname();
System.out.println("employee annual package"+" "+E1.annualsalary());
Employee E2= new  Employee (101512032, "Tara", "Sharma",51000.99);
E2.displayfullname();
System.out.println("employee annual package"+" "+E2.annualsalary());
}
}



