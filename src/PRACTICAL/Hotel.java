package PRACTICAL;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    String name;
    String location;
    String ownerName;
    ArrayList<Hotel> HotelList;
    public Hotel(){
        HotelList=new ArrayList<>();
    }

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addHotel(String name,String location,String ownerName){
        for (Hotel n:HotelList){
            if(n.getName().equals(name)){
                return;
            }
        }
        Hotel d = new Hotel(name,location,ownerName);
        HotelList.add(d);
    }

    public void checkhotel  (String name){
        for (Hotel ht: HotelList){
            if (ht.getName().equals(name)){
                System.out.println("Thong tin khach hang"+ownerName+"la");
                System.out.println("Ten Khach san:"+ht.getName()+"vi tri:"+ht.getLocation());
                return;
            }else System.out.println("Khong co thong tin");
            Hotel a = new Hotel();

        }
        System.out.println("Khong co ket qua");
    }

}
