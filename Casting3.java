//another method for Casting2 program.
import java.util.Scanner;
public class Casting3 
{
public static void main(String[] args) 
{
Scanner input= new Scanner(System.in);
int a=input.nextInt();
float f=input.nextFloat();
double d=input.nextDouble();
float x;
int y;
float z;
x=(float)a;
y=(int)f;
z=(float)d;
System.out.println("x="+x+" y="+y+" z="+z);
}
}