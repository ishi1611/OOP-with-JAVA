package assignment1;

import java.util.*;

public class program2_1 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        boolean result = (year % 4 == 0);

        switch(result) 
        {
        case 1 :
            System.out.println("Leap Year");
            break;
        case 2 : 
            System.out.println("Not a Leap Year");
            break;
        default :
            System.out.println("Invalid");
            break;

        }
    }
}
