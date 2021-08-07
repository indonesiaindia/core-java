//Name : Sujit
//Fees : 20000           output came
//Name : siddharth
//Fees : 30000
//researchArea : Software Engineering
class Student 
{
private final String name;
private int year;
private static final int annualFees = 10000;



public Student(String name, int year)//constructor 
{
this.name = name;
this.year = year;
}



public String getDetails()//method 
{
return "Name : "+ name+'\n'+ "Fees : "+ this.computeFees();
}



public int computeFees()//method 
{
return Student.annualFees * this.year;//annual 
//fees is static
//therefore it is dotted with class name
}
}







class ResearchStudent 
{
private final String name;
private int year;
private static final int annualFees = 10000;
private String researchArea;



public ResearchStudent(String name, int year, String researchArea) 
{
this.name= name;//constructor
this.year= year;
this.researchArea=researchArea;
}



public String getDetails() 
{
return "Name : "+ name+'\n'+"Fees : "+ this.computeFees()+'\n'+"researchArea : "+researchArea ;
}



public int computeFees() 
{
return ResearchStudent.annualFees * this.year;
}
}









public class olive 
{
public static void main(String[] args) 
{
Student s1 = new Student("Sujit", 2);//object
System.out.println(s1.getDetails());



ResearchStudent s2 = new ResearchStudent("siddharth", 3,"Software Engineering");//object
System.out.println(s2.getDetails());
}
}

/*
WHAT HAVE WE LEARNED
--------------------
- Inheriting using extends
- Initialising the 
super-class object using 'super' keyword 
in the sub-class's constructor.
- The fact that 
the super-class's methods (e.g. getDetails) are 
also part of the sub-class.
*/