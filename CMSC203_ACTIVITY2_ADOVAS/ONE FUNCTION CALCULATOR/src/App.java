import java.util.Scanner;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        int InputOne;
        int InputTwo;
        int Result;

        Scanner s = new Scanner(System.in);
            System.out.print("Num : ");
            InputOne = s.nextInt();

            System.out.print("Num : ");
            InputTwo = s.nextInt();
        

        Result = InputOne + InputTwo;
        System.out.println(InputOne + "+" + InputTwo + "=" + Result);

    }
}
