package lab5;

import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach;
        sach = new Sach();
        
        System.out.println("=================================");
        System.out.println("Nha Xuat Ban : " +sach.nhaXuatBan);
        System.out.println("Loai Sach : " +sach.loaiSach);
        System.out.println("Nam Xuat Ban : " +sach.namXuatBan);
        System.out.println("Gia Ban : " +sach.giaBan);
        System.out.println("So Luong : " +sach.soLuong);
    }
}