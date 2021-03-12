package PRACTICAL;

public class Main {
    public static void main(String[]args){
        Hotel a=new Hotel();
        a.addHotel("Thanh Xuan","Ha Noi","Manh VG");
        a.addHotel("Cau Giay","Ha Noi","Huong Gino");
        a.addHotel("Ha Dong","Ha Noi","Le Dat");
        a.addHotel("Dong Da","Ha Noi","Gia Thinh");
        a.addHotel("Yen Hoa","Ha Noi","Bui Son");
        a.addHotel("Thang Long","Ha Noi","Huy");
        a.addHotel("Tran Duy Hung","Ha Noi","Tran Van Dan");
        a.addHotel("Duong Dinh Nghe ","Ha Noi","Neymar Jr");
        a.addHotel("Trung Hoa","Ha Noi","Gducky");
        a.addHotel("Nhan Chinh","Ha Noi","Binz");

        for (Hotel y:a.HotelList){
            System.out.println("Ten khach san:"+y.name+"Vi tri:"+y.location+"Chu so huu:"+y.ownerName);
        }

    }
}
