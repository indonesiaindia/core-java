/*Increasing or decreasing order
Description
Write Java code to check whether numbers entered
by the user are in increasing order or decreasing
and print .The numbers entered are in increasing 
order. for increasing order and .The numbers 
entered are in decreasing order. for decreasing 
order.
If the numbers are in neither increasing order 
then print .The number are in neither in 
increasing order nor in decreasing order.
Sample Input:
11
19
132
Sample Output:
The numbers entered are in increasing order*/
import java.util.Scanner;
public class Aku
{
public static void main(String[] args) 
{
int n1,n2,n3;
Scanner input = new Scanner(System.in);
n1 = input.nextInt();
n2 = input.nextInt();
n3 = input.nextInt();
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
