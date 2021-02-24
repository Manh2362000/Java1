package assignment.s1;

import java.util.Scanner;

public class Main {
    public static void main(String[]ags){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh 1");
        float c1 = sc.nextFloat();
        System.out.println("Nhap canh 2");
        float c2 = sc.nextFloat();
        System.out.println("Nhap canh 3");
        float c3 = sc.nextFloat();

        TamGiac tg = new TamGiac();
        tg.setCanh1(c1);
        tg.setCanh2(c2);
        tg.setCanh3(c3);

        if (tg.kiemtraTamGiac()){
            System.out.println("Chu Vi"+tg.chuVi());
            System.out.println("Dien Tich"+tg.DienTich());
        }
    }
}
