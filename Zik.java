//Write a program that prints all the odd 
//numbers from 25 to 1 (in decreasing order).
/*25
23
21
19
17
15
13        output
11
9
7
5
3
1*/
public class Zik 
{
public static void main(String[] args) 
{
int number = 25; 
while (number >= 1) 
{
if(number%2==1)	
System.out.println (number );
number=number-1;
} 
}
}