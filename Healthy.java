// 30.932599999999997
/*Create a class Rectangle with class variables 
length and breadth, and a class method to 
calculate the area of a rectangle given its 
length and breadth. Instantiate a rectangle 
object R1 where R1 is assigned length 7.33 and 
breadth 4.22. Calculate the area of R1 and 
demonstrate the abstraction.*/
public class Healthy
{
public static void main(String[] args) 
{
Rectangle r1 = new Rectangle(7.33,4.22);
printRectangle(r1);
}
public static void printRectangle(Rectangle r)
{
double result= r.area();	
System.out.println(result);
}
}
class Rectangle
{
public double length;
public double breadth;
public Rectangle(double l,double b )//constructor
{
length = l;//constructor
breadth=b;
}
public double area() 
{
double rectangleArea=length*breadth;	
return rectangleArea ;
}
}

