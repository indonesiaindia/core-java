/*Modify Code
Given below is a Rectangle class consisting 
of an upper left coordinate and a lower 
right coordinate.

class Rectangle {
   int upperLeftX;
   int upperLeftY;
   int lowerRightX;
   int lowerRightY;
}
Since the upper left coordinate 
and lower right coordinate 
comprise of points, how would 
you modify the definition of the 
Rectangle class to include these 
points in your class?

Hint: You can create a Point class 
to store the x and y coordinates of the 
upper left and lower right points and 
use composition to include the upper 
left and lower right points inside the 
Rectangle class, as objects of the Point class.*/
class Rectangle { 
   Point ul; 
   Point lr; 
} 

class Point { 
   int x; 
   int y; 
   Point(int i, int j) { 
      this.x=i; this.y=j; 
   }
}