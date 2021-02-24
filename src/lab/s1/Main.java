package lab.s1;

public class Main {
    public static void main(String[] args) {
        Product1 pr1 = new Product1();
        Product1 pr2 = new Product1();
        Product1 pr3 = new Product1();

        pr1.id=1;
        pr1.productname = "SP so 1";
        pr1.qty = 20;
        pr1.price = 15.00;
        pr1.unit = "chiếc";
        pr1.changeqty(4);
        pr1.changeprice(20);
        if (pr1.checkStock()) {
            System.out.println("San pham"+pr1.productname+"con"+pr1.qty+"sp");
        }else {
            System.out.println("San pham"+pr1.productname+"het hang");
        }

    }
}
