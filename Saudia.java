//The statement said by the person is true.  
//output came
// Nigeria program done by upgrad
import java.util.Scanner;
public class Saudia 
{
public static void main(String[] args) 
{
int X,Y,A,B,heartRate;
Scanner input= new Scanner(System.in);
X=input.nextInt();
Y=input.nextInt();
A=input.nextInt();
B=input.nextInt();
heartRate=input.nextInt();
boolean test;
test=(X+Y)>30 && (A>3 || B<6) && heartRate==70;
System.out.println("The statement said by the person is "+test);
}
}
