//55        output came
/*Sum of numbers
Description
Write a program that prints the sum of 
first n numbers, where n is the input from the user. For e.g., if the user input is 10, the output of the program should be 55.
Input: 
10
Output:
55

Note: Please enter your input in the 
Input Console before clicking on Test Run.*/
import java.util.Scanner;
class Titu 
{
public static void main(String arg[]) 
{
Scanner scan = new Scanner(System.in);
//Enter the number upto which you wish to 
//find the sum, in the input console
int number = scan.nextInt();
int sum = 0;
for ( int i = 1; i <= number; i++ ) 
{
sum=sum+i;
}
System.out.print(sum);
}
}