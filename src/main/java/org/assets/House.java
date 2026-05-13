package org.assets;

public class House extends Asset {
    //<editor-fold desc="House Constructor">
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    //</editor-fold>

    @Override
    public double getVaule(){
        double vaule = 0;
        switch(condition){
            case 1:
                vaule = squareFoot * 180 + (.25 * lotSize);
                break;
            case 2:
                vaule = squareFoot * 130 + (.25 * lotSize);
                break;
            case 3:
                vaule = squareFoot * 90 + (.25 * lotSize);
                break;
            case 4:
                vaule = squareFoot * 80 + (.25 * lotSize);
                break;
            default:
                System.out.println("oh no!");
                break;
        }
        return vaule;
    }
}
