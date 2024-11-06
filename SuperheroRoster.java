public class SuperheroRoster {
 
    public static void main(String[] args) {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
 
        // Example:
        // String[] heroNames = {...};
        // String[] abilities = {...};
        // int[] powerLevels = {...};
        String [] heroNames = {"Daredevil", "Flash","Spiderman","Batman","Arrow","Ant-Man",};
        String [] abilities = {"Senses","Speed","Agility","Intelligience","Marksmanship","Quantum"};
        int [] powerLevels = {100,85,65,45,75,70};
        // 2. Print each hero's details using a loop
        // for (int i = 0; i < heroNames.length; i++) { ... }

        for (int i = 0; i < heroNames.length; i++)
        {

            System.out.println("Hero: " + heroNames[i] + ", Abilities: " + abilities[i] + ", PowerLevel: " + powerLevels[i]);
            
        }
        // 3. Call the searchHero method to find a specific hero by name
        searchHero(heroNames, abilities, powerLevels, "Flash");

        // 4. Calculate and display the average power level by calling calculateAveragePower method
        double power = calculateAveragePower(powerLevels);
        
        System.out.println("\nThe average power level is " + power);


    }
 
    // Method: searchHero
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        // Implement a loop to search for the hero by name
        // If found, print the hero's details
        // If not found, display a message
        boolean checker = false;
        for(int i = 0; i < names.length; i++)
        {
            if(names[i].equalsIgnoreCase(target))
            {   
                System.out.println("");
                System.out.println("The hero you searched is :");               
                System.out.println("Name :" + names[i]);
                System.out.println("Abilities :" + abilities[i]);
                System.out.println("Power Level :" + powerLevels[i]);
                checker = true;
                break;


            }  
                     

        }
        if (!checker)
        {
           System.out.println("Hero not found");
        }


        
    }
 
    // Method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) {
        // Implement the calculation for average power level
        // Return the calculated average
        int sum = 0;


        for (int level : powerLevels){

            sum+= level;



        }
        return (double) sum/ powerLevels.length; // Placeholder return value
    }
}
 

class Superhero {
    // Declare attributes: name, ability, and powerLevel
    public String ability;
    public String name;
     public int powerLevel;
    // Constructor to initialize name, ability, and powerLevel
    public Superhero(String name, String ability, int powerLevel)
    {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;



    }

 
    // Method: displayHero
    public void displayHero() {
        // Print the hero's name, ability, and power level
        System.out.println("Name :" + name);
        System.out.println("Ability :" + ability);
        System.out.println("Powerlevel :" + powerLevel);
    }
}