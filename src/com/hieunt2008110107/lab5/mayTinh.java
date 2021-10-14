package lab5;

import java.util.Scanner;

public class MayTinh {
    String nhaSanXuat;
    int namSanXuat;
    String heDieuHanh;
    String ram;
    String CPU;
    double gia;
    double namBaoHanh;

    void nhapThongTinMayTinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nha san xuat : ");
        nhaSanXuat = scanner.nextLine();
        System.out.print("Nhap he dieu hanh : ");
        heDieuHanh = scanner.nextLine();
        System.out.print("Nhap RAM : ");
        ram = scanner.nextLine();
        System.out.print("Nhap CPU : ");
        CPU = scanner.nextLine();
        System.out.print("Nhap gia : ");
        gia = scanner.nextDouble();
        System.out.print("Nhap nam bao hanh : ");
        namBaoHanh = scanner.nextDouble();
        System.out.print("Nhap nam san xuat : ");
        namSanXuat = scanner.nextInt();
        scanner.close();
    }
    
    MayTinh(){
        nhapThongTinMayTinh();
    }
}