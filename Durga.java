/*Sign of a number
Description
Write a Java program to determine whether a 
number entered by a user is positive or 
negative. (Assume that the user will enter
a non-zero integer).

1) Print out "The number entered is 
negative" if the number entered is negative

2) Print out "The number entered is 
positive" if the entered number if positive

Sample Input:

-1

Sample Output:

The number entered is negative*/
import java.util.Scanner;
public class Durga 
{
public static void main(String[] args) 
{
int n;
Scanner input= new Scanner(System.in);
n=input.nextInt();
//write your code here to 
//determine is n is an even or odd number
if(n>0)
{
System.out.println("The number entered is positive");
}
else
{
System.out.println("The number entered is negative");	
}
}
}