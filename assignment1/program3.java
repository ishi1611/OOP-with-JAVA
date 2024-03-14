import java.util.*;

public class program3 {
  public static void main(String[] args) {
    char operator;
    int x, y, res;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.next().charAt(0);
    System.out.println("Enter first number");
    x = input.nextInt();
    System.out.println("Enter second number");
    y = input.nextInt();
    switch (operator) {
      case '+':
        res = x + y;
        System.out.println(res);
        break;

      case '-':
        result = x - y;
        System.out.println(res);
        break;

      case '*':
        result = x * y;
        System.out.println(res);
        break;

      case '/':
        result = x / y;
        System.out.println(res);
        break;

      default:
        System.out.println("Invalid");
        break;
    }
  }
}