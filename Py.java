//  4             output came
/*Average of numbers
Description
Take n integers as input and print their average. 
The input will be in the following format:
The first line will contain n which is the 
number of integers to be taken average of.
The next n lines will contain n integers.
Average of n numbers= Sum of numbers/n

Sample Input:
2
3
7
Sample Output:
5*/
import java.util.Scanner;
public class Py 
{
public static void main(String[] args) 
{
Scanner input= new Scanner(System.in);
int n=input.nextInt();
int sum=0,number;
for (int i=1;i<=n;i++)//another way of geneva 
//program
{
number=input.nextInt();
sum=sum+number;
}
int average=sum/n;
System.out.print(average);
}
}

