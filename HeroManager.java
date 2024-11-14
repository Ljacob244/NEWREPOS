import java.util.ArrayList;
import java.util.Arrays;


public class HeroManager
{
    public ArrayList<Hero> heroes = new ArrayList<>();

    // Add hero method
    public void addHero(Hero hero)
    {
        heroes.add(hero);
    }

    // Remove hero method
    public void removeHero(String name)
    {
    heroes.removeIf(hero -> hero.getName().equalsIgnoreCase(name));        
    }
    


    public void bubbleSortHeroes()
    {
        int n = heroes.size();
       for(int i = 0; i < n - 1; i++)
       {
        for(int j = 0; j < n - i - 1; j++)
        {
            if(heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel())
            {
                Hero temp = heroes.get(j);
                heroes.set(j, heroes.get(j + 1));
                heroes.set(j + 1, temp);
            }    
        }
       }
    }


    public void insertionSort()
    {
       int n = heroes.size();
       for(int i = 0; i < n; i++)
       {
        Hero key = heroes.get(i);
        int j = i - 1;
        while(j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel())
        {
            heroes.set(j + 1, heroes.get(j));
            j--;
        }
        heroes.set(j + 1, key);
       } 
    }


    public void hero2DArray()
    {
        // Creating the 2d array, [][] for rows and columns
        String [][] hero2DArray = new String[heroes.size()][3];
        for(int i = 0; i < heroes.size(); i++)
        {
         Hero hero = heroes.get(i);  
         hero2DArray[i][0] = hero.getName();
         hero2DArray[i][1] = String.valueOf(hero.getPowerLevel());
         hero2DArray[i][2] = hero.getAffiliation().toString();
        }
        System.out.println(Arrays.deepToString(hero2DArray));

    }


    public void displayHeroes() {
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
    
  



}