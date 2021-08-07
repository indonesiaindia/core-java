class Square {
   protected double length, breadth;
   Square(double length, double breadth) {
      this.length = length;
      this.breadth = breadth;
      System.out.println("Length=" + length + "Breadth=" + breadth);
   }
}
public class Cube extends Square {
   double height;
   Cube(double length, double breadth, double height) {
      this.height = height;
      super(length, breadth);
      System.out.println("Height=" + height);
   }
   public static void main(String args[]) {
      Cube obj = new Cube(4,5,6);
   }
}