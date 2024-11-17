public class Car extends Vehicle
{

    private int numberOfDoors;


    public Car(int speed, double fuel, int numberOfDoors)
    {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }
    
    // Default Constructor 
    public Car(){
        super();
        this.numberOfDoors = 0;
    }

    @Override
    public void Start()
    {
        System.out.println("The Car has started running");
    }

    public void Honk()
    {
        System.out.println("Beep Beep");
    }


    public void setDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;

    }

    public int getDoors()
    {
        return(numberOfDoors);
    }

















}