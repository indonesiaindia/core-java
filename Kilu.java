/*Feedback :
The loop first prints the numbers and then 
checks the conditions. It does not go to the 
break statement because of the preceding 
if-condition that makes it skip the rest 
of the statements when i = 5, 6, 7.
1
2
3
4
5       output came
6
7
8
9
10
11
12*/
public class Kilu 
{
public static void main(String args[]) 
{
for (int i = 1; i <= 12; i++) 
{
System.out.println(i);
if(i > 4 && i < 8) 
{
continue;
}
else if (i == 5) 
{
break;
}
}
}
}