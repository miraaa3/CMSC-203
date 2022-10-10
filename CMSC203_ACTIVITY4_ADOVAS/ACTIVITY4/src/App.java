import java.util.Scanner;
public class App {
    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int i = 1;
        do {
        
            
        System.out.println("\nOUTPUT");
        System.out.print("Month: ");
        int Month = scan.nextInt();

        System.out.print ("Day: ");
        int Day = scan.nextInt();
    
 
        System.out.print("Year: ");
        int Year = scan.nextInt();
        
    

        switch (Month) {
            case 1:
                System.out.print("January ");
                break;

                case 2:
                System.out.print("February ");
                break;

                case 3:
                System.out.print("March ");
                break;

                case 4:
                System.out.print("April ");
                break;

                case 5:
                System.out.print("May ");
                break;

                case 6:
                System.out.print("June ");
                break;

                case 7:
                System.out.print("July ");
                break;

                case 8:
                System.out.print("August ");
                break;

                case 9:
                System.out.print("September ");
                break;

                case 10:
                System.out.print("October ");
                break;

                case 11:
                System.out.print("November ");
                break;

                case 12:
                System.out.print("December ");
                break;

            default:
                System.out.println("No value found");
                break;
        }


        if (Day <= 31) {
            System.out.print(Day + "," );
            
        } else {
            System.out.println("\nDay mustn't exceeded to 31.");
        }
        

        if (Year >= 1000 && Year <= 3000) {
            System.out.print(Year);
            
        } else {
            System.out.println("\nYear must range from 1000-3000.");
        }
      } while (i > 0);
    }
}
