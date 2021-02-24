package lab.s2;

import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Kiem tra so nguyen to:\n");
        System.out.println("Nhap vao so nguyen to duong:\n");
        int a =sc.nextInt();
        SoNguyenTo snt = new SoNguyenTo();
        if(snt.isSoNguyenTo(a)){
            System.out.printf("So : " +a +" la so nguyen to");
        }else{
            System.out.printf("So : " +a +" khong phai la so nguyen to");
        }
        }
    }

