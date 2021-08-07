//Name : karan
//Fees : 20000.0
//Fees of candidate is : 20000.0        output came
//siddharth is a research student with research area Software Engineering and he/she is in his/her year 3
//3000.0
class Student 
{
protected final String name;//protected
protected int year;
private static final int annualFees = 10000;



public Student(String name, int year)//constructor 
{
this.name= name;
this.year= year;
}



public String getDetails()//method 
{
return "Name : "+ name+'\n'+"Fees : "+ computeFees();
}



public float computeFees ()//method 
{
return  Student.annualFees *this.year;
}




public float computeFees(int annualFees)//important
{
return  Student.annualFees*this.year;
}
}







class ResearchStudent extends Student 
{
private String researchArea;
private static final int annualFees =10000;




public ResearchStudent(String name, int year, String researchArea) 
{
super(name,year);//constructor
this.researchArea = researchArea;
}

//@Override

public String getDetails()//be careful here 
{
return this.name +" is a research student with research area " + this.researchArea + " and he/she is in his/her year " + this.year;
}
}







public class Samsung 
{
public static void main(String[] args) 
{
	
Student s1 = new Student("karan", 2);
System.out.println(s1.getDetails());
System.out.println("Fees of candidate is :"+" "+s1.computeFees());



ResearchStudent s2 = new ResearchStudent("siddharth", 3, "Software Engineering");
System.out.println(s2.getDetails());
System.out.println(s2.computeFees(1000));//below method is called here
/*public float computeFees(int annualFees)//important
{
return  Student.annualFees*this.year;
}*/
}
}

