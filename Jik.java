//2
//4
//6          output came
//8
/*n multiples of x
Description
Write a program to print n multiples of x, where
n and x are integers entered by the user.
The first line of input will contain x and the 
second line will have n.

Sample Input:
2
4
Sample Output:
2
4
6
8*/
import java.util.Scanner;
public class Jik 
{
public static void main(String[] args) 
{
int x,n;
Scanner input= new Scanner(System.in);
x=input.nextInt();
n=input.nextInt();
int counter=1;
while (counter<=n)
{
System.out.println(x*counter);
counter=counter+1;
}
}
}