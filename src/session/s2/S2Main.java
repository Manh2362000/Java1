package session.s2;

public class S2Main  {
    public static void main(String[]args){
        Car c = new Car();//chay luon ham khoi tao tai day
        //c.model = "911";
        c.setModel("911");
        //c.setSoBanhXe(4);
        System.out.println("So banh xe:"+c.getSoBanhXe());
        c.run();
        c.going();
    }
}
