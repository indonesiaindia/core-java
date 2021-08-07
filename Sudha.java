//product of all the numbers from 1 to 10
//it means 1*2*3*4*5*6*7*8*9*10
//3628800     output
public class Sudha 
{
public static void main(String[] args) 
{
int num = 1;
int product = 1;
while (num <= 10) 
{
product = product*num;
num =num+1;
}
System.out.println(product);
}
}