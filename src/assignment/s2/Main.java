package assignment.s2;

public class Main {
    public static void main(String[]args){
        Fration ft1= new Fration();
        ft1.setTuso(1);
        ft1.setMauso(2);
        Fration ft2 = new Fration();
        ft2.setTuso(1);
        ft2.setMauso(3);
        Fration t= ft1.add(ft2);
        t.printFration();
    }
}
