public class Bicycle extends Vehicle
{

    private boolean hasBell;

    // Constructor
    public Bicycle(int speed, double fuel, boolean hasBell)
    {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    public Bicycle()
    {
        super();
        this.hasBell = false;
    }



    @Override
    public void Start()
    {
       System.out.println("Starting to Pedal Away");
    }

    public void ringBell()
    {
        if(hasBell == true)
        {
            System.out.println("Ring Ring");

        }
        else
        {
            System.out.println("The bicycle has no bell currently");

        }
    }




    public void setHasBell(boolean hasBell)
    {
        this.hasBell = hasBell;
    }
 
    public boolean getHasBell(boolean hasBell)
    {
        return(hasBell);
    }









}