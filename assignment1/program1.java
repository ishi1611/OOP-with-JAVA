import java.util.*;

public class program1 {
    public static void main(String[] args) 
    {
        int year;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the year:");
year = sc.nextInt();

if (year%4 == 0)
{
System.out.println(Leap Year);
}
else
{
System.out.println(Not a leap year);
}
}
}
