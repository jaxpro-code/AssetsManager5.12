package org.assets;

public class Vehicle extends Asset {
    //<editor-fold desc="Vehicle Constructor">
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    //</editor-fold>

@Override
    public double getVaule(){
        double value = 0;
        switch(year){
            case 1:
                value = this.getOriginalCost() - (this.getOriginalCost() * .03);
                break;
            case 2:
                value = this.getOriginalCost() - (this.getOriginalCost() * .06);
                break;
            case 3:
                value = this.getOriginalCost() - (this.getOriginalCost() * .08);
                break;
            case 4:
                value = 1000.00;
                break;
            default:
                System.out.println("oh no!");
        }
            if(!getMakeModel().toLowerCase().contains("honda") && !getMakeModel().toLowerCase().contains("toyota")){
                if(getOdometer()>= 100000){
                    value = getVaule() - (getVaule() * .25);
            }
        }
        return value;
}


}
