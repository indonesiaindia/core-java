/*For Loop
Description

Write a code that prints the numbers 
between 2,000 and 3,000, which are divisible
by 8 but not by 6. (Hint: apply 
Boolean condition - number%8==0 && number%6!=0)
Note:
Please print all the even numbers on the 
same line, such as:
2000 2008 2024  ...
and not on different lines, such as:
2000
2008
2024
...

Input:
No input required
Output:
2000 2008 2024 2032 2048 2056 2072 2080 2096 
2104 2120 2128 2144 2152 2168 2176 2192 2200 
2216 2224 2240 2248 2264 2272 2288 2296 2312 
2320 2336 2344 2360 2368 2384 2392 2408 2416 
2432 2440 2456 2464 2480 2488 ..........2992*/
public class Liz 
{
public static void main(String[] args) 
{
int i;
for ( i = 2000; i <= 3000; i++) 
{
if (i%8==0 && i%6!=0) 
{
System.out.print(i + " ");
}
}
}
}