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

    Cow(){
        nhapThongTinCow();
    }
    Cow(double w){
        weight = w;
        w = 15; 
    }
}