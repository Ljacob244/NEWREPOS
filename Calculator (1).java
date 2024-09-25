import java.util.Scanner;


public class Calculator
{


    public static Scanner input = new Scanner(System.in);
    

    public static void main(String args[])
    {
          
        while(true){
           
        System.out.println("Input a math operation or exit");
        String operation = (input.nextLine());

        if(operation.equals("Exit") || operation.equals("exit"))
        {
            System.out.println("Exiting the calculator");
            break;
        }

       



        System.out.println("Give the first number :");
        double num1 = input.nextDouble();
        System.out.println("Give the second number :");
        double num2 = input.nextDouble();
        input.nextLine();



        operationChecker(operation, num1, num2);
        
        System.out.println("Do you want to keep using the calculator?");
        String choice = (input.nextLine());

        if(choice.equals("Yes"))
        {
            continue;
        }
        else if(choice.equals("No"))
        {
            break;
        }
        
    }
        
        }

    
        






    public static void operationChecker(String operation,double num1, double num2)
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

            if(num2 == 0)
            {
                System.out.println("Error: Division by zero is not possible");

            }
            else{

                double result = num1 / num2;
            System.out.println("Your result is" + result);

            }


            
            
            



            
        
        }


        
        
    


       

        


    


        
       







    } 


    

}