package assignment.s2;

import java.util.Scanner;

public class Fration {
    private int tuso;
    private int mauso;

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso!=0?mauso:1;
    }
    public void inputFration(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        setTuso(sc.nextInt());
        System.out.println("Nhap mau so:");
        setMauso(sc.nextInt());
    }
    public void printFration(){
        System.out.println("Pham so:"+getTuso()+"/"+getMauso());
    }
    public  void rutgon(){
        //tim UCLN cua tu so va mau so
        int ucln = timUCLN();
        setTuso(getTuso()/ucln);
        setMauso(getMauso()/ucln);

    }
    public int timUCLN(){
        for (int i=Math.min(getTuso(),getMauso());i>0;i--){
            if (getTuso()%i==0&&getMauso()%i==0) return i;
        }
        return 1;
    }
    public void nghichdao(){
        int ms=getMauso();
        if (getTuso()!=0){
            setMauso(getTuso());
            setTuso(ms);
        }else{
            System.out.println("khong the nghich dao");
        }
    }
    public Fration add(Fration ft){
        int ms = this.getMauso()* ft.getMauso();
        int ts = this.getTuso()*ft.getMauso()+ft.getTuso()*this.getMauso();
        Fration tong = new Fration();
        tong.setTuso(ts);
        tong.setMauso(ms);
        tong.rutgon();
        return tong;
    }
    public Fration sub(Fration st){
        int ms = this.getMauso()* st.getMauso();
        int ts = this.getTuso()*st.getMauso()-st.getTuso()*this.getMauso();
        Fration hieu = new Fration();
        hieu.setTuso(ts);
        hieu.setMauso(ms);
        hieu.rutgon();
        return hieu;
    }
    public Fration mul(Fration ft){
        int ts = this.getTuso()*ft.getMauso();
        int ms = this.getMauso()*ft.getTuso();
        Fration tich = new Fration();
        tich.setTuso(ts);
        tich.setMauso(ms);
        tich.rutgon();
        return  tich;
    }
    public Fration div(Fration ft){
        Fration thuong = new Fration();
        thuong.setTuso(this.getTuso()*ft.getMauso());
        thuong.setMauso(this.getMauso()*ft.getTuso());
        thuong.rutgon();
        return thuong;
    }
}
