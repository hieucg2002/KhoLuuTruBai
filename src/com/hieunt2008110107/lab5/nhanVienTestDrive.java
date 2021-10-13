package lab5;

import java.util.Scanner;

public class nhanVienTestDrive {
    public static void main(String[] args) {
        nhanVien nhanVien;
        nhanVien = new nhanVien();
        
        System.out.println("==================");
        System.out.println("Ten Nhan Vien : " +nhanVien.tenNhanVien);
        System.out.println("Dia Chi : " +nhanVien.diaChi);
        System.out.println("Bo Phan Lam Viet : " +nhanVien.boPhanLamViet);
        System.out.println("Ngay sinh : " +nhanVien.ngaySinh);
        System.out.println("Luong : " +nhanVien.luong);
    }
}