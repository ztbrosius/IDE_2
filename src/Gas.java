public class Gas {
    //setup variable
    private String carName;
    private double financePayment;
    private double milesPerGallon;
    private  double monthlyCost;
//    private double costPerGallon;

    // set up constructor
//    public  Gas(String carName, double financePayment, double milesPerGallon, double costPerGallon){
    public  Gas(String carName, double financePayment, double milesPerGallon){
        this.carName = carName;
        this.financePayment = financePayment;
        this.milesPerGallon = milesPerGallon;

//        this.costPerGallon = costPerGallon;
    }// ends constructor

    // begin getter and setter
    //carName
    public void setCarName(String nameOfCar){carName = nameOfCar;}
    public String  getCarName(){
        return carName;
    }

    //financePayment
    public void setFinancePayment(double carPayment){financePayment = carPayment;}
    public double getFinancePayment(){
        return financePayment;
    }

    //milesPerGallon
    public void setMilesPerGallon(double mileageCost){milesPerGallon = mileageCost;}
    public double getMilesPerGallon(){
        return milesPerGallon;
    }


    //costPerGallon
//    public void setCostPerGallon(double gallonCost){costPerGallon = gallonCost;}
//    public double getCostPerGallon(){
//        return costPerGallon;
//    }


}// ends Gas class

