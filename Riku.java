/*Grading
Description
Write a Java program to print a students grade
based on his marks. You will take the students 
name and marks as input and determine the grade 
based on the following:


Marks | Grade
>100 | A
>80 & <=100 | B
>60 & <=80 | C
>40 & <=60 | D
<=40 | E

Input format: 
The first line will contain the name of the 
student and the second line will contain 
students marks.
Output format:
The program should print:
The grade scored by <name> is <grade>

Sample Input:
Aishwarya
33
Sample Output:
The grade scored by Aishwarya is E

Sample Input:
Aishwarya
49
Sample Output:
The grade scored by Aishwarya is D */
import java.util.Scanner;
public class Riku
{
public static void main(String[] args) 
{
String name;
int marks;
Scanner input = new Scanner(System.in);
name = input.nextLine();//nextLine is used for string.
marks = input.nextInt();
if(marks>100)
{
System.out.println("The grade scored by "+name + " is A " );
}
else if (marks>80&& marks<=100)
{
System.out.println("The grade scored by "+name + " is B " );  	
}
else if (marks>60&& marks<=80)
{
System.out.println("The grade scored by "+name + " is C " );  		
}
else if (marks>40&& marks<=60)
{
System.out.println("The grade scored by "+name + " is D " );  			
}
else if(marks<=40)
{
System.out.println("The grade scored by "+name + " is E " );  			
}
}
}