//header
/*
IDE Project 2
CSC 222
Zachary Brosius

A calculator where the user inputs data and the program spits out certain vehicles and the costs associated.
 */
// imported packages
import java.util.Scanner;
import java.text.DecimalFormat;

// begin Main class
public class Main {

    // formats decimals to 2 places
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");

    // begin main method
    public static void main(String[] args) {

        // establish variables
        double costPerGallon;
        double costPerMile;
        int milesPerWeek;
        double gasPerMonth;
        double electricPerMonth;
        double milesPerMonth;
        double monthlyCost;
        double WEEK_IN_MONTH = 4.345;

        // scanner to allow user to input data
        Scanner input = new Scanner(System.in);

        // output/user input
        System.out.println("Welcome to Electric vs Gas Car Modeling App - OOP Version");
        System.out.println("You will need to enter details about gas costs, electricity costs, and how many miles you drive weekly");
        System.out.println("******************");
        System.out.println("How much is gas per gallon? ");
        costPerGallon = input.nextDouble();
        System.out.println("How much is electricity per mile? ");
        costPerMile = input.nextDouble();
        System.out.println("How many miles do you drive a week? ");
        milesPerWeek = input.nextInt();
        System.out.println("**** Calculation Results ***");

        // set up the cars
        Gas car1 = new Gas("2020 Chevrolet Corvette", 1692.00, 19.00);
        Gas car2 = new Gas("2015 Ford F-150", 397.00, 17.00);
        Gas car3 = new Gas("2022 Subaru BRZ", 581.00, 22.00);
        Electric car4 = new Electric("2023 Mercedes-Benz EQS SUV", 1779.00, 78.00);
        Electric car5 = new Electric("2023 Rivian R1S", 1944.00, 71.00);
        Electric car6 = new Electric("2021 Porsche Taycan", 1782.00, 79.00);

        // perform calculations to convert from weeks to months
        milesPerMonth = milesPerWeek * WEEK_IN_MONTH;
        gasPerMonth = costPerGallon * milesPerMonth;
        electricPerMonth = costPerMile * milesPerMonth;

        // calculate each cars monthly cost
        double car1Monthly = car1.getFinancePayment() + (gasPerMonth / car1.getMilesPerGallon());
        double car2Monthly = car2.getFinancePayment() + (gasPerMonth / car2.getMilesPerGallon());
        double car3Monthly = car3.getFinancePayment() + (gasPerMonth / car3.getMilesPerGallon());
        double car4Monthly = car4.getFinancePayment() + electricPerMonth;
        double car5Monthly = car5.getFinancePayment() + electricPerMonth;
        double car6Monthly = car6.getFinancePayment() + electricPerMonth;

        //output car details
        System.out.println(car1.getCarName() + " Total Monthly Costs: $" + DECIMAL_FORMAT.format(car1Monthly));
        System.out.println(car2.getCarName() + " Total Monthly Costs: $" + DECIMAL_FORMAT.format(car2Monthly));
        System.out.println(car3.getCarName() + " Total Monthly Costs: $" + DECIMAL_FORMAT.format(car3Monthly));
        System.out.println(car4.getCarName() + " Total Monthly Costs: $" + DECIMAL_FORMAT.format(car4Monthly));
        System.out.println(car5.getCarName() + " Total Monthly Costs: $" + DECIMAL_FORMAT.format(car5Monthly));
        System.out.println(car6.getCarName() + " Total Monthly Costs: $" + DECIMAL_FORMAT.format(car6Monthly));
        
    }// ends main method
} // end Main class