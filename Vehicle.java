public class Vehicle
{


    protected int speed;
    private double fuel;

    // Constructor w parameters
    public Vehicle(int speed, double fuel)
    {
        this.speed = speed;
        this.fuel = fuel;
        
    }

    // Default Constructor
    public Vehicle()
    {
        this.speed = 0;
        this.fuel = 0.00;
    }

    public void Start()
    {
        System.out.println("The Vehicle has started Running");
    }

    public void Stop()
    {
        System.out.println("The Vehicle has stopped running");
    }

    public void displayFuel()
    {
        System.out.println("The remaining fuel level is " + fuel);
    }




    // Setter Methods
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }


    public void setFuel(double fuel)
    {
        this.fuel = fuel;
    }





    //Getter Methods
    public int getSpeed()
    {
        return speed;
    }

    public double Fuel()
    {
        return fuel;
    }



}