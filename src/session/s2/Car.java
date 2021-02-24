package session.s2;

public class Car {
    public String model;
    protected int soBanhXe;


    //constructor - ham khoi tao
    public Car(){
        setSoBanhXe(4);
    }
    /*
        1. ten giong ten lop
        2. khong co gia tri tra ve( k cos void int ... truoc ten ham)
        3.tu dong chay khi tao doi tuong
     */

    public String getModel(){
        return model;
    }//getter

    public void setModel(String m){
        this.model = m;
    }//setter

    public int getSoBanhXe() {
        return soBanhXe;
    }

    public void setSoBanhXe(int soBanhXe) {
        this.soBanhXe = soBanhXe;
    }

    public void run(){
        System.out.println(this.model+"Running...");
    }
    void going(){
        run();
    }

}

