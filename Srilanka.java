/*Keep on driving!
Keep on driving!
Keep on driving!  OUTPUT CAME
Keep on driving!.
Keep on driving!
Need to refuel!*/
public class Srilanka 
{
public static void main(String[] args) 
{
boolean keepDriving = false;
int currentFuel = 5;
while (currentFuel > 0)
{
keepDriving = true;
System.out.println("Keep on driving!");
currentFuel=currentFuel-1;
}
keepDriving = false;
System.out.println("Need to refuel!");
}
}