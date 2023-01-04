using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AdovasMethods
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Car c = new Car("Honda", "2023 Civic Si", "Glossy Black", "180-hp Turbocharged Engine", "215 km/h", 2023, 24, 650);
            c.launch();
            c.specifications();

        }
    }
}
