//interest = 6400     output came
//amount =  86400
/*Calculate Simple Interest
If a person wants to borrow Rs.80,000 for 
2 years from Bank A at 4% rate of 
interest, calculate the interest and the 
total amount to be paid at the end of 2 years.*/ 
public class Moisture 
{
public static void main(String[] args) 
{
Bank obj=new Bank(80000,2,4);
System.out.println("interest ="+" "+obj.interest());
System.out.println("amount = "+" "+ obj.amountpaid());	 
}
}
class Bank
{
private int principal;
private int time;
private  int rate;
public Bank(int p,int t,int r)//constructor
{
principal=p;//constructor
time=t;
rate=r; ;
}
public int interest()//method
{
int i= (principal*rate*time)/100;
return i;
}
public int amountpaid()//method
{
int i= (principal*rate*time)/100;	
int amount= principal+i;
return amount;
}
}