import java.util.Scanner;
public class Welcome 
{
public static void main( String[] args ) 
{
String name;
int year;
Scanner input= new Scanner(System.in);
System.out.println("enter the name ");
name = input.nextLine();//Line is used for string.
System.out.println("enter the year");
year = input.nextInt();
System.out.println("Hello" + " " + name);
System.out.println("Free services till:"+(year+4));
}
}	