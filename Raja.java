/*Odd or Even
Description
Write a Java program to determine if a number
entered by the user is odd or 
even.(Assume that the user will 
enter a positive integer only).

1) Print out "The number entered 
is even" if the number entered is even

2) Print out "The number entered 
is odd" if the entered number if odd

Sample Input:

2

Sample Output:

The number entered is even*/
import java.util.Scanner;
public class Raja 
{
public static void main(String args[]) 
{
Scanner input= new Scanner(System.in);
int number= input.nextInt();
if(number%2==0)
{
System.out.println("The number entered is even");
}
else
{
System.out.println("The number entered is odd");
}
}
}