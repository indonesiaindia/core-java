import java.util.Scanner;
public class Casting2 
{
public static void main( String[] args ) 
{
int a;
float f;
double d;
Scanner input= new Scanner(System.in);
System.out.println("Enter the value for a");
a=input.nextInt();
System.out.println("Enter the value for f");
f=input.nextFloat();
System.out.println("Enter the value for d");
d=input.nextDouble();
float x = (float)a;
int y = (int)f;
float z = (float)d;
System.out.println(x);
System.out.println(y);
System.out.println(z);



}
}	