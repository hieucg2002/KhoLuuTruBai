package lab5;

import java.util.Scanner;

public class Sach {
    String nhaXuatBan;
    int namXuatBan;
    double giaBan;
    int soLuong;
    String loaiSach;

    void nhapThongTinSach(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nha xuat ban : ");
        nhaXuatBan = scanner.nextLine();
        System.out.print("Nhap loai sach : ");
        loaiSach = scanner.nextLine();
        System.out.print("Nhap nam xuat ban : ");
        namXuatBan = scanner.nextInt();
        System.out.print("Nhap gia ban : ");
        giaBan = scanner.nextDouble();
        System.out.print("Nhap so luong : ");
        soLuong = scanner.nextInt();
        scanner.close();
    }
    
    Sach(){
        nhapThongTinSach();
    }
}
