using System;
using System.Collections.Generic;
using System.Linq;

namespace LINQAssignment {
    public class Student {
        public string First { get; set; }
        public string Last { get; set; }
        public int Id { get; set; }
        public List<int> Scores;
        public override string ToString() {
            return string.Format("{0} {1} - {2} ", First, Last, Id);
        }
    }

    class Fruit {
        public string Name { get; set; }
        public string Origin { get; set; }
        public double Price { get; set; }
        public override string ToString() {
            return string.Format("{0} @{1:c} ({2})", Name, Price, Origin.Substring(0, 2).ToUpper());
        }
    }

    class Person {
        public string Name { get; set; }
        public double Asset { get; set; }
        public bool IsFemale { get; set; }
        public string Country { get; set; }
        public int Age { get; set; }
        public override string ToString() {
            return string.Format("{0} {1}B {2} {3} {4}yrs", Name, Asset, IsFemale ? "F" : "M", Country, Age);
        }
    }

    class PetOwner {
        public string FirstName { get; set; }
        public string LastName { get; set; }
    }
    class Pet {
        public string Name { get; set; }
        public PetOwner Owner { get; set; }
    }


    public class Program {
        static List<Student> students = new List<Student> {
            new Student{ First="Xavier", Last="Thomas", Id=111, Scores=new List<int>{97,92 ,81 , 55, 60 } },
            new Student{ First="Lyoid", Last="Lopes", Id=112, Scores=new List<int>{96, 88, 86, 77, 55 } },
            new Student{ First="Navdeep", Last="Singh", Id=113, Scores=new List<int>{92, 97, 65, 89, 45} },
            new Student{ First="Lyle", Last="Spurrell", Id=114, Scores=new List<int>{90, 95, 75, 78, 83 } },
            new Student{ First="Viktor", Last="Salnichenko", Id=115, Scores=new List<int>{87, 96, 65, 34, 90} },
            new Student{ First="Sukhpratap", Last="Singh", Id=116, Scores=new List<int>{90, 87, 56, 98, 78 } },
            new Student{ First="Dannel", Last="Alon", Id=117, Scores=new List<int>{90, 84,59 ,67 , 98 } },
            new Student{ First="Francis", Last="Acheampong", Id=118, Scores=new List<int>{89, 56, 56, 67, 87 } },
            new Student{ First="Mahamod", Last="Masleh", Id=119, Scores=new List<int>{67, 78,46 , 78, 98 } },
            new Student{ First="John", Last="Calma", Id=120, Scores=new List<int>{89, 76, 78, 67, 87} },
            new Student{ First="Sarina", Last="Luu", Id=121, Scores=new List<int>{67, 67, 87, 74, 95} },
            new Student{ First="Valerie", Last="Chan", Id=122, Scores=new List<int>{87, 69, 95, 67, 49} },
            new Student{ First="Tej", Last="Singh", Id=127, Scores=new List<int>{90, 87, 96, 98, 78 } },
            new Student{ First="Mabel", Last="Tang", Id=123, Scores=new List<int>{87, 78,59 , 75, 67} },
            new Student{ First="Rishav", Last="Giri", Id=124, Scores=new List<int>{65, 87, 58, 92, 68} },
            new Student{ First="Toni", Last="Lea", Id=125, Scores=new List<int>{78, 97, 83, 83, 87} },
            new Student{ First="Melanie", Last="March", Id=126, Scores=new List<int>{89, 79, 80, 95, 97 } }

        };

        static List<Person> persons = new List<Person>() {
            new Person(){ Age = 72, Asset = 7.0, Country="South Africa", IsFemale=false, Name="Nicky Oppenheimer"},
            new Person(){ Age = 67, Asset = 7.6, Country="India", IsFemale=true, Name="Savitri Jindal"},
            new Person(){ Age = 81, Asset = 3.1, Country="India", IsFemale=true, Name="Indu Jain"},
            new Person(){ Age = 70, Asset = 2.5, Country="India", IsFemale=true, Name="Vinod Gupta"},
            new Person(){ Age = 77, Asset = 27.0, Country = "US",IsFemale = true,Name = "Jacqueline Mars"},
            new Person(){ Age = 76, Asset = 25.2, Country = "Italy", IsFemale = true, Name = "Maria Franca Fissolo"},
            new Person(){ Age = 55, Asset = 20.4, Country = "Germany", IsFemale = true, Name = "Susanne Klatten"},
            new Person(){ Age = 53, Asset = 20.0, Country = "US",IsFemale = true,Name = "Laurene Jobs"},
            new Person(){ Age = 60, Asset = 12.5, Country = "Nigeria", IsFemale=false, Name="Aliko Dangote" },
            new Person(){ Age = 76, Asset = 10.9, Country = "Ethiopia", IsFemale=false, Name="Mohammed Al Amoudi"},
            new Person(){ Age = 60, Asset = 30.7, Country = "Canada", IsFemale=false, Name="David Thomson" },
            new Person(){ Age = 76, Asset = 11.4, Country = "Canada", IsFemale=false, Name="Galen Weston"},
            new Person(){ Age = 60, Asset = 22.3, Country = "India", IsFemale=false, Name="Mukesh Ambani"},
            new Person(){ Age = 50, Asset = 17.5, Country = "India", IsFemale=false, Name="Dilip Shanghvi"},
            new Person(){ Age = 83, Asset = 30.4, Country = "US", IsFemale=false, Name="Sheldon Adelson"},
            new Person(){ Age = 78, Asset = 30.0, Country = "Brazil", IsFemale=false, Name="Jorge Lemann"},
            new Person(){ Age = 62, Asset = 18.4, Country = "Russia", IsFemale=false, Name="Leonid Mikhelson"},
            new Person(){ Age = 51, Asset = 17.5, Country = "Russia", IsFemale=false, Name="Alexey Mordashov"},
            new Person(){ Age = 89, Asset = 31.2, Country = "Hong Kong", IsFemale=false, Name="Li Ka-shing"},
            new Person(){ Age = 62, Asset = 31.2, Country = "China", IsFemale=false, Name="Wang Jianlin"},
            new Person(){ Age = 67, Asset = 33.8, Country = "US", IsFemale=true, Name="Alice Walton" },
            new Person(){ Age = 60, Asset = 34.0, Country = "US", IsFemale=false, Name="Jim Walton"},
            new Person(){ Age = 72, Asset = 34.1, Country = "US", IsFemale=false, Name="Rob Walton"},
            new Person(){ Age = 94, Asset = 39.5, Country = "France", IsFemale=true, Name="Liliane Bettencourt"},
            new Person(){ Age = 43, Asset = 39.8, Country = "US", IsFemale=false, Name="Sergey Brin"},
            new Person(){ Age = 43, Asset = 39.6, Country = "US", IsFemale=false, Name="Larry Page"},
            new Person(){ Age = 68, Asset = 41.5, Country = "France", IsFemale=false, Name="Bernard Arnault"},
            new Person(){ Age = 75, Asset = 47.5, Country = "US", IsFemale=false, Name="Michael Bloomberg"},
            new Person(){ Age = 77, Asset = 48.3, Country = "US", IsFemale=false, Name="David Koch"},
            new Person(){ Age = 81, Asset = 48.3, Country = "US", IsFemale=false, Name="Charles Koch"},
            new Person(){ Age = 72, Asset = 52.2, Country = "US", IsFemale=false, Name="Larry Ellison"},
            new Person(){ Age = 77, Asset = 54.5, Country = "Mexico", IsFemale=false, Name="Carlos Slim Helu"},
            new Person(){ Age = 33, Asset = 56.0, Country = "US", IsFemale=false, Name="Mark Zuckerberg"},
            new Person(){ Age = 81, Asset = 71.3, Country = "Spain", IsFemale=false, Name="Amancio Ortega"},
            new Person(){ Age = 53, Asset = 72.8, Country = "US", IsFemale=false, Name="Jeff Bezos" },
            new Person(){ Age = 85, Asset = 75.6, Country = "US", IsFemale=false, Name="Warren Buffet" },
            new Person(){ Age = 60, Asset = 86.0, Country = "US", IsFemale=false, Name="Bill Gates"}
        };

        static List<Fruit> fruits = new List<Fruit>() {
            new Fruit(){ Name="Mango", Origin="Guyana", Price=5.67},
            new Fruit(){ Name="Kiwi", Origin="New Zeeland", Price=1.34},
            new Fruit(){ Name="Dragon Fruit", Origin="China", Price=3.45},
            new Fruit(){ Name="Avacado", Origin="Mexico", Price=2.56},
            new Fruit(){ Name="Banana", Origin="Ecuador", Price=0.25},
            new Fruit(){ Name="Persimon", Origin="Spain", Price=1.36 },
            new Fruit(){ Name="Blueberry", Origin="Canada", Price=0.19 },
            new Fruit(){ Name="Strawberry", Origin="Russia", Price=0.45 },
            new Fruit(){ Name="Avocado", Origin="Mexico", Price=0.45 }
        };

        static void Main() {
            // 1.Select All The Persons With Assets Of Over 50B Dollars.
            var personWithAssetsGT50B = from person in persons where person.Asset > 50.0 select person;
            Console.WriteLine("1. Select All The Persons With Assets Of Over 50B Dollars.\n");
            foreach (var person in personWithAssetsGT50B) {
                Console.WriteLine("=> " + person);
            }

            Console.WriteLine();

            // 2.Select All Non-US Citizens.
            var nonUSCitizens = from person in persons where person.Country != "US" select person;
            Console.WriteLine("2. Select All Non-US Citizens.\n");
            foreach (var person in nonUSCitizens) {
                Console.WriteLine("=> " + person);
            }

            Console.WriteLine();

            // 3. Select The Name of All The Females From India.
            // Your Query Should Only Capture The Person’s Name. (This Is A Projection Query)
            var femalesFromIndia = from person in persons where person.Country == "India" && person.IsFemale select person.Name;
            Console.WriteLine("3. Select The Name of All The Females From India.\n");
            foreach (var name in femalesFromIndia) {
                Console.WriteLine("=> " + name);
            }

            Console.WriteLine();

            // 4. Select All Persons Whose First Name Is Less Than Five Letters Long.
            var personWithNameLessThan5Letters = from person in persons where person.Name.Split(' ')[0].Length < 5 select person;
            Console.WriteLine("4. Select All Persons Whose First Name Is Less Than Five Letters Long.\n");
            foreach (var person in personWithNameLessThan5Letters) {
                Console.WriteLine("=> " + person);
            }

            Console.WriteLine();
            // 5. Sort The Collection By Assets. Your Query Should Only Capture The Person’s Name & Asset.
            var personSortedByAssests = from person in persons orderby person.Asset select new { person.Name, person.Asset };
            Console.WriteLine("5. Sort The Collection By Assets. Your Query Should Only Capture The Person’s Name & Asset.\n");
            foreach (var person in personSortedByAssests) {
                Console.WriteLine("=> {0}, {1} B", person.Name, person.Asset);
            }

            Console.WriteLine();

            // 6. Group The Collection By Country.
            var groupByCountry = from person in persons group person by person.Country;
            Console.WriteLine("6. Group The Collection By Country.\n");
            foreach (var group in groupByCountry) {
                Console.WriteLine("---- {0} ----", group.Key);
                foreach (var person in group) {
                    Console.WriteLine("  " + person);
                }
            }

            Console.WriteLine();

            // 7. Sort The Above Grouping.
            // Not Clear On What Column To Sort?
            // So, Sorting Group Key
            var sortedGroupByCountry = groupByCountry.OrderBy(group => group.Key);
            Console.WriteLine("7. Sort The Above Grouping.\n");
            foreach (var group in sortedGroupByCountry) {
                Console.WriteLine("---- {0} ----", group.Key);
                foreach (var person in group) {
                    Console.WriteLine("  " + person);
                }
            }

            Console.WriteLine();

            // 8. Make Up Three Queries Of Your Own.
            // 1. Average Age Of Person In Country
            var ageGroup = from person in persons group person by person.Country into g select new { Country = g.Key, AverageAge = g.Average(p => p.Age) };
            Console.WriteLine("8. Average Age Of Persons In Each Country\n");
            foreach (var group in ageGroup) {
                Console.WriteLine("{0}: {1} Years", group.Country, group.AverageAge);
            }

            Console.WriteLine();

            // 2. Country With Most Females
            var maxFemales = (from person in persons where person.IsFemale group person by person.Country into g select new { Country = g.Key, Count = g.Count() }).FirstOrDefault();
            Console.WriteLine("9. Country With Max Females: {0}, Count: {1}", maxFemales.Country, maxFemales.Count);

            Console.WriteLine();

            // 3. Person With Most Assets
            var personWithMostAssets = (from person in persons orderby person.Asset descending select person).FirstOrDefault();
            Console.WriteLine("10. Person With Most Assets: {0}", personWithMostAssets);
        }
    }
}
