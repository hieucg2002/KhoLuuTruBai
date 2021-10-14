package lab5;

import java.util.Scanner;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();
        
        System.out.println("==================");
        System.out.println("Ten Nhan Vien : " +nhanVien.tenNhanVien);
        System.out.println("Dia Chi : " +nhanVien.diaChi);
        System.out.println("Bo Phan Lam Viet : " +nhanVien.boPhanLamViet);
        System.out.println("Ngay sinh : " +nhanVien.ngaySinh);
        System.out.println("Luong : " +nhanVien.luong);
    }
}