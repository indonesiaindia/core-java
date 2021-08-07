//Area of given rectangle is  30.932599999999997
class Rectangle 
{
private double length;
private double breadth;
public Rectangle(double length, double breadth)
{
this.length=length;
this.breadth=breadth;
}
public double areaOfRectangle() 
{
return length*breadth;
}
}
public class Brown 
{
public static void main(String[] args) 
{
Rectangle R1= new Rectangle(7.33,4.22);
System.out.println("Area of given rectangle is "+" "+R1.areaOfRectangle());
}
}
