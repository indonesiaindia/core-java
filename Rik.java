import java.util.Scanner;
public class Rik 
{
public static void main( String[] args ) 
{
Scanner input = new Scanner(System.in);	
int marks[];
marks = new int[5];
System.out.println(" enter the marks of 0 roll");
marks[0]= input.nextInt();
System.out.println(" enter the marks of 1 roll");
marks[1]= input.nextInt();
System.out.println(" enter the marks of 2 roll");
marks[2]= input.nextInt();
System.out.println(" enter the marks of 3 roll");
marks[3]= input.nextInt();
System.out.println(" enter the marks of 4 roll");
marks[4]= input.nextInt();
System.out.println(marks[4]);
}
}	