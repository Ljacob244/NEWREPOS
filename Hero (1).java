public class Hero
{


    // declaring variables //   
    public String name;
    public int powerLevel;
    public Affiliation affiliation;

    // Constructor // 
    public Hero(String name, int powerLevel, Affiliation affiliation)
    {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;

    }


    // Getter Methods // 
    public String getName()
    {
        return name;
    }


    public int getPowerLevel()
    {
        return powerLevel;
    }

    public Affiliation getAffiliation()
    {
        return affiliation;
    }


    // toString method //
    public String toString()
    {
        return "Hero{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                ", affiliation='" + affiliation + '\'' +
                '}';

    }

    public enum Affiliation
    {
        AVENGERS, JUSTICE_LEAGUE,X_MEN,FANTASTIC_FOUR;
    }
    




}