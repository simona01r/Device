package se.device;

public class AComputer extends Device {

    public AComputer( double price) {
        super(price);
    }
//jgjgj
    @Override
    public double discount(int amount) {
        setAmount(amount);
        setPrice( getPrice()-amount);
      return getPrice() ;

    }

    @Override
    public String toString() {
        String info="[ Computer "+ super.toString()+" ]";
        return info;
    }
}
