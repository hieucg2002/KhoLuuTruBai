package lab5;

import java.util.Scanner;

public class TaiKhoan {
    String tenChuTaiKhoan;
    String soTaiKhoan;
    String soDuTaiKhoan;

    void nhapThongTinTaiKhoan(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten chu tai khoan : ");
        tenChuTaiKhoan = scanner.nextLine();
        System.out.print("Nhap so tai khoan : ");
        soTaiKhoan = scanner.nextLine();
        System.out.print("Nhap so du tai khoan : ");
        soDuTaiKhoan = scanner.nextLine();
        scanner.close();
    }

    TaiKhoan(){
        nhapThongTinTaiKhoan();
    }
}