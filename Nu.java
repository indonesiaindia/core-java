/*1
2
6
24
120
720
5040     output came
40320
362880
3628800*/
public class Nu 
{
public static void main(String[] args) 
{
int product = 1;
for (int num = 1; num <= 10; num++) 
{
product = product*num;
System.out.println(product);
}
}
}