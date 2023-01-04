using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AdovasMethods
{
    internal class Car
    {
        public string brand, modelname, color, speciality,speed;
        public int releasedate,  price;

        public Car(string brand, string modelname, string color, string speciality, string speed, int releasedate, int price, int v)
        {
            this.brand = brand;
            this.modelname = modelname;
            this.color = color;
            this.speciality = speciality;
            this.speed = speed;
            this.releasedate = releasedate;
            this.price = price;
        }
        public void launch()
        {
            Console.WriteLine("This will be the newly launch car of" + brand + "," + " the " + modelname + ".");
        }

        public void specifications()
        {
            Console.WriteLine("The Attributes are: " + color + " for the car color, and its average speed is " + speed + " with " + speciality + ".");
        }

    }
}
