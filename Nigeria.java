/*Lie Detector
Description
Assume that you have made some modifications
to make the lie detector more sensitive and
accurate.

You will be taking chemicals X,Y, A and B as 
inputs. Also, you will take the heart
rate(heartRate) as input.

The person is telling the truth if all the 
following conditions are met:

1.Sum of amounts of X and Y is greater than 30
2.Either A is greater than 3 or B is less than 6
3.Heart rate is equal to 70


The first four lines of input will have
X,Y,A and B as inputs in that particular order.

The next line of input will have the heart rate.

 If the person is telling the 
 truth, display "The statement said
 by the person is true". If the person
 is lying then display "The statement 
 said by the person is false".

Sample Input:

15

16

4

5

70

Sample Output:

The statement said by the person is true*/
import java.util.Scanner;
public class Nigeria 
{
public static void main(String[] args) 
{
int X,Y,A,B,heartRate;
Scanner input= new Scanner(System.in);
X=input.nextInt();
Y=input.nextInt();
A=input.nextInt();
B=input.nextInt();
heartRate=input.nextInt();
//boolean result = (X+Y)>30;
//boolean com = A>3;
//boolean cos = B<6;
//boolean china = heartRate==70;
//System.out.println(result);
//System.out.println(com);
//System.out.println(cos);
//System.out.println(china);
boolean india= ((X+Y)>30)&& (A>3||B<6)&& (heartRate==70);
System.out.println("The statement said by the person is "+india);
}
}
