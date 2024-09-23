import java.util.Scanner;


public class Calculato
{


    public static Scanner input = new Scanner(System.in);
    

    public static void main(String args[])
    {
          
        while(true){
           
        System.out.println("Input a math operation or exit");
        String operation = (input.nextLine());

        if(operation.equals("Exit"))
        {
            System.out.println("Exiting the calculator");
            break;
        }

       



        System.out.println("Give the first number :");
        double num1 = input.nextDouble();
        System.out.println("Give the second number :");
        double num2 = input.nextDouble();



        operationChecker(operation, num1, num2);
        
    }
        
        }

    
        






    public static double operationChecker(String operation,double num1, double num2)
    {

      

        
        if(operation.equals("+"))    
        {
            double result = num1 + num2;
            System.out.println("Your result is " + result);
            
        }

        else if(operation.equals("-"))
        {
            double result = num1 - num2;
            System.out.println("Your result is " + result);
        }
        
        else if(operation.equals("/"))
        {
            double result = num1 / num2;
            System.out.println("Your result is" + result);
        }

        return double result;
        
        
        
    


       

        


    



       







    }

}