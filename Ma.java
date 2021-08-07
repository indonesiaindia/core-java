/* output will be blank line.
The ASCII value of “a” is 97 and “A” is 65. 
Accordingly, the output cannot be “a”.
Subtracting these values gives us 32 
which is the ASCII code for a space. 
Hence, you will be able to see a blank space on 
the screen.*/
public class Ma 
{
public static void main(String[] args) 
{
char a='a';
char b='A';
int i=(int)a-(int)b;
char c=(char) i;
System.out.print(c);	
}
}
