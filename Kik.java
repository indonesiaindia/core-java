//1
//2         MY output came
//3
//4
/*Printing natural numbers till n
Description
Write a program to print numbers from 1 to n, where 
n is a number taken as input from the user.

Sample Input:
4
Sample Output:
1 
2
3
4*/
import java.util.Scanner;
public class Kik 
{
public static void main(String[] args) 
{
int n;
Scanner input= new Scanner(System.in);
n=input.nextInt();
int counter=1;
while (counter<=n)
{
System.out.println(counter);
counter=counter+1;
}
}
}
