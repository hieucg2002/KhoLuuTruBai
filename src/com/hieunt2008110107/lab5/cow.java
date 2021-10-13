package lab5;

import java.util.Scanner;

public class cow {
    double weight;
    int age;

    void nhapThongTinCow(){
        age = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap can nang : ");
        weight = scanner.nextDouble();
        scanner.close();
    }

    cow(){
        nhapThongTinCow();
    }
    cow(double w){
        weight = w;
        w = 15; 
    }
}