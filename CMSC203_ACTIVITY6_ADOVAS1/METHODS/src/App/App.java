package App;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    
    car c = new car("Honda", "2023 Civic Si", "Glossy Black ", "180-hp Turbocharged Engine", "215 km/h", 2023, 24560);   
     c.launch();
     c.specifications();
  }
}
