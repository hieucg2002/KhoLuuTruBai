package lab5;

import java.util.Scanner;

public class Cow {
    double weight;
    int age;

    void nhapThongTinCow(){
        age = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap can nang : ");
        weight = scanner.nextDouble();
        scanner.close();
    }

    void moo(){
        int bienCucBo=5;
        System.out.println(bienCucBo);
        System.out.println("Be Be...");
    }

    Cow(){
        moo(); //gắn moo
        nhapThongTinCow();
        weight = 11.2;
    }

    Cow(double w){
        weight = w;
        w = 15; 
    }

    Cow(double w, int a){
        weight = w;
        age = a;
    }
}