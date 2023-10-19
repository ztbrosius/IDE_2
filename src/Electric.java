public class Electric {
    //setup variable
    private String carName;
    private Double financePayment;
    private Double milesPerGallonEquivalent;
    private double totalMonthlyCost;

    //create constructor
    public Electric(String carName, Double financePayment, Double milesPerGallonEquivalent){

        this.carName = carName;
        this.financePayment = financePayment;
        this.milesPerGallonEquivalent = milesPerGallonEquivalent;

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
    public void setCostPerMile(double mileageCost){milesPerGallonEquivalent = mileageCost;}
    public double getCostPerMile(){
        return milesPerGallonEquivalent;
    }

    public void setTotalMonthlyCost(double totalCostPerMonth){totalMonthlyCost = totalCostPerMonth;}
    public double getTotalMonthlyCost(){
        return financePayment + totalMonthlyCost;
    }

}// ends Electric class
