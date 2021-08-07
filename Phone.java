import java.util.Scanner;
public class  Phone 
{
public static void main(String[] args) 
{
int sum=0;
int i=1;
Scanner input = new Scanner(System.in);
//int number=input.nextInt();
while(i<3)
{
int number=input.nextInt();
sum= sum+number;
i++;
}
System.out.println(sum*sum);
}
}

