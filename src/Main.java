//header
/*
IDE Project 2
CSC 222
Zachary Brosius

A calculator where the user inputs data and the program spits out certain vehicles and the costs associated.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

    // formats decimals to 2 places
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");

    public static void main(String[] args) {

        // variables
        double costPerGallon;
        double costPerMile;
        int milesPerWeek;
        double gasCalc;
        double electricCalc;
        double milesPerMonth;
        int WEEK_IN_MONTH = 4;

        // scanner so user can input data
        Scanner input = new Scanner(System.in);

        //output
        System.out.println("******************");
        System.out.println("How much is gas per gallon? ");
        costPerGallon = input.nextDouble();
        System.out.println("How much is electricity per mile? ");
        costPerMile = input.nextDouble();
        System.out.println("How many miles do you drive a week? ");
        milesPerWeek = input.nextInt();
        System.out.println("Gas: " + costPerGallon + "\nElectricity: " + costPerMile + "\nMiles: " + milesPerWeek);

        // perform calculations
        gasCalc = costPerGallon * milesPerWeek;
        electricCalc = costPerMile * milesPerWeek;
        milesPerMonth = milesPerWeek * WEEK_IN_MONTH;


    }// ends main method
} // end Main class