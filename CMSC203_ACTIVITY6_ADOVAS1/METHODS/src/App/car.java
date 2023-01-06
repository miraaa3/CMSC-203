package App;


public class car {
    public String brand, modelname, color, speciality,speed;
    public int releasedate,  price;

    car(String brand, String modelname, String color, String speciality, String speed, int releasedate, int price)
    {
        this.brand = brand;
            this.modelname = modelname;
            this.color = color;
            this.speciality = speciality;
            this.speed = speed;
            this.releasedate = releasedate;
            this.price = price;
    }
    public car(String string, String string2, String string3, String string4, String string5, int i, int j, int k) {
    }
    public void launch()
    {
       System.out.println("This will be the newly launch car of " + brand + "," + " the " + modelname + ".");
    }
    public void specifications()
        {
            System.out.println("The Attributes are: " + color + " for the car color, and its average speed is " + speed + " with " + speciality + ".");
        }
}
