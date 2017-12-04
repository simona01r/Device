package se.device;


public class ATv extends Device {

    private EnTvType tvType;
    private String supplierTv;

    public ATv(double price, EnTvType tvType, String supplierTv) {
        super(price);
        this.tvType = tvType;
        this.supplierTv = supplierTv;
    }

    @Override
    public double discount(int amount) {
        setAmount(amount);
        setPrice(getPrice() - amount);
        return getPrice();
    }

    @Override
    public String toString() {
        String info = "[ Tv " + super.toString() + " ]";
        return info;
    }

}
