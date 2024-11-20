public class Main {
    public static void main(String[] args) {

        // Create an instance of HeroManager
        HeroManager heroManager = new HeroManager();

        // Adding heroes to the list
        heroManager.addHero(new Hero("SPIDERMAN", 90, Hero.Affiliation.AVENGERS));
        heroManager.addHero(new Hero("Batman", 80, Hero.Affiliation.JUSTICE_LEAGUE));
        heroManager.addHero(new Hero("Wolverine", 90, Hero.Affiliation.X_MEN));
        heroManager.addHero(new Hero("Wonder Woman", 95, Hero.Affiliation.JUSTICE_LEAGUE));
        heroManager.addHero(new Hero("SuperMan", 100, Hero.Affiliation.JUSTICE_LEAGUE));
        heroManager.addHero(new Hero("Cyclops", 75, Hero.Affiliation.X_MEN));

        // Printing original list of heroes
        System.out.println("The original list of heroes:");
        heroManager.displayHeroes();

        // Using bubble sort method
        heroManager.bubbleSortHeroes();
        System.out.println("\nHeroes Sorted by Power Level (Bubble Sort):");
        heroManager.displayHeroes();

        // Using insertion sort method
        heroManager.insertionSort();
        System.out.println("\nHeroes Sorted by Power Level (Insertion Sort):");
        heroManager.displayHeroes();

        // Removing Wolverine from the list
        heroManager.removeHero("Wolverine");
        System.out.println("\nAfter Removing Wolverine:");
        heroManager.displayHeroes();

        // Adding Flash to the list
        heroManager.addHero(new Hero("Flash", 100, Hero.Affiliation.JUSTICE_LEAGUE));
        System.out.println("\nAfter Adding Flash:");
        heroManager.displayHeroes();

        // Display heroes in 2D array format
        System.out.println("\nThe heroes in a 2D array format:");
        heroManager.hero2DArray();


        


    }
}
