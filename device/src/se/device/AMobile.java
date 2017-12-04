package se.device;


public class AMobile extends Device {

    private EnMobileOs mobileOs;
    private String operatorsName;

    public AMobile(double price, EnMobileOs mOs, String operatorsName) {
        super(price);
        this.mobileOs = mOs;
        this.operatorsName = operatorsName;
    }

    public EnMobileOs getmOs() {
        return mobileOs;
    }

    public void setmOs(EnMobileOs mOs) {
        this.mobileOs = mOs;
    }

    public String getOpratorsName() {
        return operatorsName;
    }

    public void setOpratorsName(String opratorsName) {
        this.operatorsName = opratorsName;
    }

    @Override
    public double discount(int amount) {
        setAmount(amount);
        setPrice(getPrice() - (getPrice() * (double)(amount / 100.0)));
        return getPrice();
    }

    @Override
    public String toString() {
        String info = "[ Mobile " + super.toString() + " ]";
        return info;
    }

}
