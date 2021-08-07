class Coffee
{
   protected void order()
    {
        System.out.println("Coffee");
    }
}

public class Ulman extends Coffee
{
   public static void main(String args[])
   {  
       Cappuccino c = new Cappuccino();  
       c.order();  
   }      
}