public class Electric {
    //setup variable
    private String carName;
    private Double financePayment;
    private Double costPerMile;

    //create constructor
    public Electric(String carName, Double financePayment, Double costPerMile){

        this.carName = carName;
        this.financePayment = financePayment;
        this.costPerMile = costPerMile;

    } // ends constructor

    //begin getter and setter
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

    //costPerMile
    public void setCostPerMile(double mileageCost){costPerMile = mileageCost;}
    public double getCostPerMile(){
        return costPerMile;
    }

}// ends Electric class
