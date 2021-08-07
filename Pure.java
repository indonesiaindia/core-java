//Name : karan
//Fees : 30000
//Name : siddharth
//Fees : 40000      output came
//Name : hari
//Fees : 10000
class Student 
{
private final String name;
private int year;
private static final int annualFees = 10000;



public Student(String name, int year)//constructor 
{
this.name= name;
this.year= year;
}



public String getDetails()//method 
{
return "Name : "+ name+ '\n' +"Fees : "+ computeFees();
}




public int computeFees ()//method 
{
return Student.annualFees*year;
}
}










class ResearchStudent extends Student 
{
private String researchArea;
private static final int annualFees = 10000;




public ResearchStudent(String name, int year, String researchArea) 
{
super(name, year);
this.researchArea = researchArea;
}
}









class PhDStudent extends ResearchStudent 
{
private String thesisTitle;
private static final int annualFees = 10000;




public PhDStudent(String name, int year, String researchArea, String thesisTitle) 
{
super(name, year, researchArea);//constructor
this.thesisTitle = thesisTitle;
}
}













public class Pure
{
public static void main(String[] args) 
{
Student s1 = new Student("karan", 3);
System.out.println(s1.getDetails());



ResearchStudent s2 = new ResearchStudent("siddharth", 4, "Software Engineering");
System.out.println(s2.getDetails());




PhDStudent s3 = new PhDStudent("hari", 1, "Software Engineering", "Automated Evaluation");
System.out.println(s3.getDetails());

}
}

