//                COMPOSITION            



//Name : karan
//Fees : 30000
//Name : siddharth
//Fees : 40000
//Name : hari
//Fees : 10000
class Student 
{
private final String name;
private int year;

private BankAccount bankAccount;//composition
//bankAccount//it is variable name
private static final int annualFees = 10000;




public Student(String name, int year, BankAccount bankAccount) 
{
this.name= name;//constructor
this.year= year;
this.bankAccount = bankAccount;
}




public String getDetails()//method 
{
return "Name : "+ name+ '\n'+"Fees : "+ computeFees();
}





public int computeFees()//method 
{
return Student.annualFees * year;
}
}









class ResearchStudent extends Student 
{
private String researchArea;
private static final int annualFees = 10000;





public ResearchStudent(String name, int year, String researchArea, BankAccount bankAccount) 
{//constructor
super(name, year, bankAccount);
this.researchArea = researchArea;
}
}






class PhDStudent extends ResearchStudent 
{
private String thesisTitle;
private static final int annualFees = 10000;





public PhDStudent(String name, int year, String researchArea, String thesisTitle, BankAccount bankAccount) 
{//constructor
super(name, year, researchArea, bankAccount);
this.thesisTitle = thesisTitle;
}
}








class BankAccount
{
private int accountNumber;
private int balance;





public BankAccount(int accountNumber, int balance)
{//constructor
this.accountNumber = accountNumber;
this.balance = balance;
}
}










public class Aftab 
{
public static void main(String[] args) 
{//composition below
BankAccount account1 = new BankAccount(111,1000);//object
BankAccount account2 = new BankAccount(222,2000);
BankAccount account3 = new BankAccount(333,3000);
Student s1 = new Student("karan", 3, account1);
System.out.println(s1.getDetails());





ResearchStudent s2 = new ResearchStudent("siddharth", 4, "Software Engineering", account2);
System.out.println(s2.getDetails());






PhDStudent s3 = new PhDStudent("hari", 1, "Software Engineering", "Automated Evaluation", account3);
System.out.println(s3.getDetails());
}
}

