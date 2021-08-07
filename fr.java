//radius of circle = 10.0        output came
//area of circle = 314.14
public class fr
{
public static void main(String[] args) 
{
Circle c1 = new Circle(10f);
System.out.println("radius of circle = " + c1.getRadius() + '\n' +"area of circle = " + c1.area());
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



public float getRadius()//getter 
{
return this.radius;
}



public void setRadius(float radius)//setter 
{
if(radius >= 0f)
{
this.radius = radius;
}
}



private float square(float radius)//private method. square method
{
return radius * radius;
}



public float area()//area method
{
return PI * square(this.radius);
}
}





