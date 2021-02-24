package lab.s1;

public class Product1 {
    int id;
    String productname;
    double price;
    int qty;
    String unit;

    void changeqty(int q){
        qty += q;
    }

    void  changeprice(double p){
        price = p;
    }

    boolean checkStock(){
        if(qty>0) return true;
        return false;
    }
}
