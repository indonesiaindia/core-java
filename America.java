/*Lie Detector
Description
Assume that you have built a lie detector 
which detects the level of chemicals X and Y.
If the sum of the amounts of X and Y is greater 
than 30, then the person is telling the truth.
Write Java code to take in the values
of X and Y and detect whether the person
is telling the truth or not. If the person is
telling the truth, display "The statement
said by the person is true". If the person
is lying then display "The statement said
by the person is false".
Sample input:
12
23
Sample output:
The statement said by the person is true */
import java.util.Scanner;
public class America 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
int x = input.nextInt();
int y = input.nextInt();
//Scanner input=new Scanner(System.in);
boolean result = (x+y)>30;
System.out.println("The statement said by the person is " +  result );
}
}