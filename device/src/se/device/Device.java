package se.device;


public abstract class  Device {

    private static int i=1000;
    public  int deviceID=0;
    private double price;
    private int amount;
    private boolean getDiscount=false;

    
    public Device( double price) {
        this.deviceID = ++i;
        this.price = price;
        this.amount = 0;
    }
    
    public abstract double discount(int amount);

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return   deviceID + ", pr =" + price + ", amount=" + amount + ", getDiscount=" + getDiscount;
    }
}
