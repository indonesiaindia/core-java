//usually .java program updated form
//1056 karan 4.2            output came
//Percentage of karan is 42.0
//Percentage of karan is 88.0


public class Tone 
{
public static void main(String[] args) 
{
Student s1 = new Student(1056, "karan" ,4.2);//object
s1.displayProfile();

System.out.println("Percentage of " + s1.getName() + " is " + s1.findPercentage());

s1.setCgpa(8.8);//due to setter method here value of cgpa is modified/ updated here.
System.out.println("Percentage of " + s1.getName() + " is " + s1.findPercentage());
}
}







class Student 
{
private int rollno;
private String name;
private double cgpa;


public Student(int r,String n,double c)//constructor
{
rollno = r;//note cgpa is not added in constructor
name = n;
cgpa = c;
}


public int getRollno()//getter 
{
return rollno;
}


public String getName()//getter 
{
return name;
}


public double getCgpa()//getter 
{
return cgpa;
}



public void setCgpa(double cgpa)//setter 
{
this.cgpa = cgpa;
}



public void displayProfile()//method 
{
System.out.println(rollno + " " + name + " " + cgpa);
}



public double findPercentage()//method 
{
double percent = cgpa * 10;
return percent;
}
}