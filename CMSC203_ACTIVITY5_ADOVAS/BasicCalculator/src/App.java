import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)  {
        final Scanner scan = new Scanner(System.in);

        while(true) {

         
        int num1=0;
        int num2=0;
        int Result;
        char operator;

        System.out.println("\n BASIC CALCULATOR");
        System.out.println();
        System.out.println("Operators: \t '+' for Addition \t '-' for Subtraction \t '*' for Multiplication \t '/' for Division \t '%' for Division with remainder");

        
        System.out.print("Choose an operator: ");
        operator = scan.next().charAt(0);

        System.out.print("Enter first number: ");
        num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        num2 = scan.nextInt();

        System.out.println();
        System.out.println("Result");
       
        switch (operator)
        {
            case '+':
            Result = num1 + num2;
            System.out.println(num1 + "+" + num2 + "=" + Result);
            break;

            case '-':
            Result = num1 - num2;
            System.out.println(num1 + "-" + num2 + "=" + Result);
            break;

            case '*':
            Result = num1 * num2;
            System.out.println(num1 + "-" + num2 + "=" + Result);
            break;

            case '/':
            Result = num1 / num2;
            System.out.println(num1 + "-" + num2 + "=" + Result);
            break;
            
            case '%':
            Result = num1 % num2;
            System.out.println(num1 + "%" + num2 + "=" + Result);
            break;

        

            default:
            System.out.println("Invalid input.");
            break;
        }
           
    

            
    } 
    }
}
