qimport java.util.*;

public class program5 
{
    public static void main(String[] args)
{
System.out.println("Enter a character :");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);

if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
{
System.out.println("Character is a vowel");
}
else
{
System.out.println("Character is not a vowel");
}
}
}
