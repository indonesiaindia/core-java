/*radius of circle = 10.0
area of circle = 314.14
radius of circle = 5.0
area of circle = 78.535*/
public class Larry
{
public static void main(String[] args) 
{
Circle c1 = new Circle(10f);
printCircle(c1);
c1.setRadius(5f);
printCircle(c1);
}
public static void printCircle(Circle c)
{
System.out.println("radius of circle = " + c.getRadius() + '\n' +"area of circle = " + c.area());
}
}
class Circle
{
private float radius;
public static final float PI = 3.1414f;
public Circle(float radius)//constructor 
{
this.radius = radius;
}
public float getRadius() 
{
return this.radius;
}
public void setRadius(float radius) 
{
if(radius >= 0f)
{
this.radius = radius;
}
}
public float area()
{
return PI * this.radius * this.radius;
}
}





