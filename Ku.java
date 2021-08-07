/*5
4
3
2         output came
1
0
Reverse Order
Description
Print first n integers starting from 0 in 
the reverse order using the for loop.
(n is an integer entered by the user)
Sample Input:
5
Sample Output
5
4
3
2
1
0*/
import java.util.Scanner;
public class Ku 
{
public static void main(String[] args) 
{
int n;
Scanner input= new Scanner(System.in);
n=input.nextInt();
for ( int i = n; i >=0 ; i-- ) 
{
System.out.println(i);	
}
}
}

