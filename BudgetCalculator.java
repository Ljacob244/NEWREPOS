class BudgetCalculator{

   
        public static void main(String args[]){

        
   
                final int SALARY = 3000;
                final double SAVINGS_PERCENT = 0.12;
                final double RENT_PERCENT = 0.30;
                final double GROCERIES_PERCENT = 0.15;
                final double ENTERTAINMENT_PERCENT = 0.10;




                double monthlySalary = SALARY;
                double savedAmount = 0;
                double rentAmount = 0;
                double groceriesAmount = 0;
                double entertainmentAmount = 0;
                double totalExpenses = 0;
                double remainingBalance = 0;







                rentAmount = monthlySalary * RENT_PERCENT;
                savedAmount = monthlySalary * SAVINGS_PERCENT;
                groceriesAmount = monthlySalary * ENTERTAINMENT_PERCENT;
                totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
                remainingBalance = monthlySalary = totalExpenses;




                System.out.println("Your monthly salary is "  + monthlySalary );
                System.out.println("The amount you saved this month is " + savedAmount);
                System.out.println("You spent " + rentAmount + " on rent");
                System.out.println("You spent " + groceriesAmount + " on groceries");
                System.out.println( "You spent "+ entertainmentAmount + " on entertainment");
                System.out.println("Your total expenses this month is " + totalExpenses);
                System.out.println("You have " + rentAmount + " left");
























        }


}