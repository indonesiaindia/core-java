//             GETTER METHOD BEGINS

//radius of circle = 10.0       output came
//area of circle = 314.14
public class Examples
{
public static void main(String[] args) 
{
Circle c1 = new Circle(10f);
printCircle(c1);
}


public static void printCircle(Circle c)
{
System.out.println("radius of circle = " + c.getRadius() + '\n' + "area of circle = " + c.area());
}
}







class Circle
{
private float radius;
public static final float PI = 3.1414f;


public Circle(float radius)// constructor 
{
this.radius = radius;
}



public float getRadius()//getter method 
{
return this.radius;
}



public float area()
{
return PI * this.radius * this.radius;
}
}





