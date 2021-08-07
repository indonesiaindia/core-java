/*Feedback :
The loop breaks immediately after checking
if i == 5 due to the break statement. Thus, it 
does not print the number 5 since the print 
statement comes later in the code after the 
break statement. So, the loop breaks after 
printing 1, 2, 3, and 4.
1
2         output came
3
4*/
class Tula 
{
public static void main(String[] args) 
{
for (int i = 1; i <= 12; i++) 
{
if (i == 5)
{
break;
}
else if(i>8 && i<11)
{
continue;
}
System.out.println(i);
}
}
}