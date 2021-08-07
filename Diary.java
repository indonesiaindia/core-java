class Coffee
{
   private void order()
    {
        System.out.println("Coffee");
    }
}
 
public class Diary
{
   public static void main(String args[])
      {
          Coffee c = new Coffee();
          c.order();
      }
}