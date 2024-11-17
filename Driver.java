public class Driver
{
    public static void main(String args [])
    {
        Car c1 = new Car(50,100,4);
        Bicycle b1 = new Bicycle(5,50,true);

        Car c2 = new Car();
        Bicycle b2 = new Bicycle();

        System.out.println("Your first car : ");
        c1.Start();
        c1.displayFuel();
        c1.Honk();

        System.out.println("----------");

        System.out.println("Your first bicycle : ");
        b1.Start();
        b1.displayFuel();
        b1.ringBell();

        System.out.println("----------");


        c2.setSpeed(120);
        c2.setDoors(2);
        c2.setFuel(45);



        System.out.println("Your second car : ");
        c2.Start();
        c2.displayFuel();
        c2.Honk();



        b2.setSpeed(15);
        b2.setFuel(20);
        b2.setHasBell(false);


        System.out.println("----------");
        System.out.println("Your second bicycle : ");

        b2.Start();
        b2.displayFuel();
        b2.ringBell();






    
    }
}