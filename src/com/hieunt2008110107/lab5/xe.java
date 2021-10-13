package lab5;

import java.util.Scanner;

public class xe {
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    String dungTichXang;

    void nhapThongTinXe(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten chu xe : ");
        hangSanXuat = scanner.nextLine();
        System.out.print("Nhap hang san xuat : ");
        hangSanXuat = scanner.nextLine();
        System.out.print("Nhap dong : ");
        dong = scanner.nextLine();
        System.out.print("Nhap giay phep : ");
        giayPhep = scanner.nextLine();
        System.out.print("Nhap dung tich xang : ");
        dungTichXang = scanner.nextLine();
        scanner.close();
    }

    xe(){
        nhapThongTinXe();
    }
}