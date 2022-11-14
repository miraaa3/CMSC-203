import java.util.Scanner;
public class App {
        public static void main(String[] args) throws Exception {
           Scanner scanner= new Scanner(System.in);
           boolean settled = false;
    
           do {
            System.out.print("NO. OF TEST CASE : ");
            int testCases = scanner.nextInt();
    
    
                if ( 1<= testCases && testCases <= 10 ) {
                    String inputs [] = new  String[testCases];
                      for (int t = 0; t < testCases; t++){
                        scanner = new Scanner (System.in);
                        
                        inputs[t] = scanner.nextLine();
                      }
                        System.out.println();
                        System.out.println();
                        System.out.println("RESULT: ");
                        System.out.println();
    
                        System.lineSeparator();
                
                             for(String input : inputs )
                             System.out.println(proccessInput(input));
                
                             settled = true;
               } else 
                             System.out.println("ENTER NUMBERS AS HIGH AS 0 AND LESS THAN 11");
           
                  
                
           } while (! settled);
           scanner.close();
    
        }
        private static String proccessInput(String input) {
            String[] inputs = input.split( "\\s+");
    
            if(inputs.length != 2)
            return "INVALID INPUT";
            try {
                int uber = Integer.parseInt(inputs[0]);
                int grab = Integer.parseInt(inputs[1]);
                 if (uber< 1|| grab > 1000)
                 return "INVALID INPUT";
    
                 if ( uber<grab)
                 return "FIRST";
                
                 else if (uber>grab)
                 return "SECOND";
                 else 
                 return "ANY";
    
             } catch (Exception e) {
                return "INVALID INPUT";
             }
        }     
    }