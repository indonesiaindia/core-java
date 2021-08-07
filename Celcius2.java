//System.out.println("Enter the value for c")is 
//missing.this statement is not mandatory to run
//program.output came.
import java.util.Scanner;
public class Celcius2 
{
public static void main(String[] args) 
{
int C, F;
Scanner input= new Scanner(System.in);
C=input.nextInt();
F=9*C/5+32;
System.out.println(F);
}
}
