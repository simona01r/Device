package se.device;


public class Repository {
    
    
    public static void initial(){
        Shop eShop = new Shop();
        eShop.addDevice(new AComputer (300));
        eShop.addDevice(new AMobile( 150, EnMobileOs.BLACKBERRY, "Telia"));
        eShop.addDevice(new AComputer (500));
        eShop.addDevice(new AMobile( 200, EnMobileOs.ANDROID, "Convique"));
        eShop.addDevice(new ATv( 3000, EnTvType.PLASMA, "Samsung"));
        eShop.addDevice(new ATv(4000, EnTvType.LCD, "LG"));
    }
}
