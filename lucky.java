//   VERY IMPORTANT CONCEPT


/*Getter Method
Description
Create an object of the given Person 
class with parameterized constructor 
initialising the name variable to ‘Ankit’, and 
then to print the value of ‘name’ variable 
using getter method.

Input
No Input Required

Output
Ankit*/

public class lucky 
{
public static void main(String[] args) 
{
// Write code here
Person s1 = new Person("Ankit");
//s1.displayname();

System.out.println("the name of person is"+" "+s1.getName());
	
}
}



class Person 
{
private String name;


public Person(String name)//constructor 
{       
this.name = name;
}
// Declare a getter method here

public String getName()//GETTER
{
return this.name;
}


/*public void displayname()
{
System.out.println(this.name);	
}
}*/
}
