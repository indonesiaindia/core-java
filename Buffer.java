//area of circle = 314.14      output came
public class Buffer
{
public static void main(String[] args) 
{
Circle c1 = new Circle(11f);//object
printCircle(c1);//another way of writing.
}


public static void printCircle(Circle c)
{
System.out.println("area of circle = " + c.area());
}
}






class Circle
{
private float radius;//private
public static final float PI = 3.1414f;


public Circle(float radius)//constructor 
{
this.radius = radius;
}


public float area()
{
return PI * this.radius * this.radius;
}
}





