package se.device;


public class Main {

    public static void main(String[] args) {
        Repository.initial();

        Shop eShop = new Shop();

//        eShop.showAllDevices();
//        System.out.println("");
////        System.out.println(eShop.romveDeviceByprice(100));

        eShop.showAllDevices();
            System.out.println("");
        eShop.findDeviceByID(1001).discount(10);
        eShop.findDeviceByID(1002).discount(10);
        eShop.findDeviceByID(1005).discount(10);
             System.out.println("");
        eShop.showAllDevices();
       
        System.out.println(eShop.getDevices(ATv.class));
    }

}
