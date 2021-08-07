/*Suggested Answer

The output of the given code is:
House 1
Bank1
Rate of interest is 7.2
The statement HomeLoan obj = new Bank1() means 
that a variable (of type HomeLoan) refers to 
the instance of class Bank1. Here, HomeLoan 
is the base class and Bank1 is the derived class. 
Now, when the 
statement obj.numbers() compiles, the 
HomeLoan class is initialised to check if it 
has an abstract method numbers. 

While the HomeLoan class is compiling, the 
constructor of the HomeLoan class is invoked, and 
it prints the output. Since the method numbers 
exists in the HomeLoan class, the code compiles 
successfully. 

During runtime, the instance obj calls the 
method numbers of the Bank1 class and 
checks if the abstract method numbers is 
derived or not.

If yes, the output of the derived class gets 
printed. 
Else, a runtime error occurs. 
When the Bank1 class is initialised to 
check for the derived method numbers, the 
constructor of the Bank1 class is invoked 
and the output is displayed. Along with it, the 
method numbers successfully runs.*/ 
//House 1
//Bank1       output came
//Rate of interest is 7.2
abstract class HomeLoan //here HomeLoan is 
//the base class
{
public HomeLoan() 
{
System.out.println("House 1");
}
abstract void numbers();
}
class Bank1 extends HomeLoan // Here Bank1 is the 
//derived class
{
public Bank1() 
{
System.out.println("Bank1");
}
void numbers() 
{
System.out.println("Rate of interest is 7.2");
}
}
public class Place 
{
public static void main(String[] args) 
{
HomeLoan obj = new Bank1();
obj.numbers();
}
}