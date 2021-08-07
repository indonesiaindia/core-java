/*Increasing or decreasing order
Write the pseudocode to check whether
the three numbers (n1, n2, n3) entered
by the user are in increasing order or 
decreasing and print .The numbers entered 
are in increasing order. for increasing 
order and .The numbers entered are in 
decreasing order. for decreasing order.
If the numbers are in neither increasing 
order then print .The number is in neither 
in increasing order nor in decreasing order.*/
import java.util.Scanner;
public class Raju
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
int n1=input.nextInt();
int n2=input.nextInt();
int n3=input.nextInt();
if ((n1>n2)&&(n2>n3))
{
System.out.println("The numbers entered are in decreasing order");
}
else if ((n1<n2)&&(n2<n3))
{
System.out.println("The numbers entered are in increasing order");
}
else
{
System.out.println("The number are in neither in increasing order nor in decreasing order");	
}
}
}