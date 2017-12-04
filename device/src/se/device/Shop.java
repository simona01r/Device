package se.device;


import java.util.*;
import java.util.Iterator;

public class Shop {

    static private ArrayList<Device> listOfDevices = new ArrayList<>();

    public void addDevice(Device d) {
        listOfDevices.add(d);
    }

    public boolean removeDevice(Device d) {
        return listOfDevices.remove(d);
    }

    public boolean romveDeviceByprice(double price) {
        Iterator it = listOfDevices.iterator();

        while (it.hasNext()) {
            if (((Device) it.next()).getPrice() > price) {
                it.remove();
            }
        }
        return true;
    }

    public Device findDeviceByID(int id) {
        for (Device d : listOfDevices) {
            if(d.getDeviceID()==id){
                return d;
            }
        }
        return null;
    }

    public ArrayList<Device> getAllDevices() {
        return new ArrayList<>(listOfDevices);
    }

    public void findAllOffers() {
    }
    
    public void showAllDevices(){
        for (Device d : listOfDevices) {
            System.out.println(d);
        }
    }

    public List<Device> getDevices(Class aClass) {
        List<Device> temp =  new ArrayList<>();
        for (Device d : listOfDevices) {
            if(d.getClass().equals(aClass))
                temp.add(d);
        }
        return temp;
    }
    
    
    
    
}
