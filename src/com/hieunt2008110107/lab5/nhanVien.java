package lab5;

import java.util.Scanner;

public class nhanVien {
    String tenNhanVien;
    double luong;
    String diaChi;
    String boPhanLamViet;
    String ngaySinh;

    void nhapThongTinNhanVien(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien : ");
        tenNhanVien = scanner.nextLine();
        System.out.print("Nhap dia chi : ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap bo phan lam viet : ");
        boPhanLamViet = scanner.nextLine();
        System.out.print("Nhap ngay sinh : ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhap luong : ");
        luong = scanner.nextDouble();
        scanner.close();
    }

    nhanVien(){
        nhapThongTinNhanVien();
    }
}