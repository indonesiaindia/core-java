//1000          output came
public class Substancial //program not clear
{
public static void main(String[] args) 
{
MovieTicket ticket = new MovieTicket(10);//object
int totalPrice = ticket.calculateCost(100);
System.out.println(totalPrice);
}
}
class MovieTicket 
{
public int singleTicketCost;
public MovieTicket(int singleTicketCost)//constructor 
{
this.singleTicketCost = singleTicketCost;
}
public int calculateCost(int quantity)//method 
{
return quantity * singleTicketCost;
}
}