package com.THICUOIKY;

import java.text.ParseException;
import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) throws ParseException {
        int luaChon = 0;
        Scanner input = new Scanner(System.in);
        DanhSachQuanLy l = new DanhSachQuanLy();
        HangHoa sp1 = new Vegetable("01", "Cam", 50000 ,1231, "2/1/2021","25/11/2021");
        HangHoa sp2 = new Vegetable("02", "Chanh", 100000 ,893, "2/1/2021","1/3/2021");
        HangHoa sp3 = new Vegetable("03", "Tao", 80000 ,562, "22/1/2021","26/2/2021");
        HangHoa sp4 = new Vegetable("04", "Chuoi", 200000 ,747, "12/02/2020","19/02/2020");
        HangHoa sp5 = new Vegetable("05", "Man", 220000 ,903, "30/11/2019","10/12/2029");
        HangHoa sp6 = new Vegetable("06", "Dau", 5000 ,2041, "13/04/2018","20/04/2018");
 
        HangHoa sp7 = new International("01", "May Giat", 25000, 235, "20/11/2021", "Gia Lam, Ha Noi");
        HangHoa sp8 = new International("02", "May Ui", 15000, 940, "19/11/2021", "Hoi An, Quang Nam");
        HangHoa sp9 = new International("03", "May Xay Toc", 100000, 322, "20/02/2013", "Vinh Long");
        HangHoa sp10 = new International("04", "May Cat Co", 10000, 446, "30/01/2011", "Bau Truc, Binh Thuan");
        HangHoa sp11 = new International("05", "May Phun Nuoc ", 35000, 783, "21/12/2028", "Thua Thien Hue");
        HangHoa sp12 = new International("06", "May May", 7000, 621, "30/04/2021", "Nam Sach, Hai Duong");
        HangHoa sp13 = new International("07", "May Ep Trai Cay", 200000, 1225, "20/12/2021", "Bat Trang");

        HangHoa sp14 = new Electronic("01", "May Lanh", 13000000, 55,"02/02/2021", 500);
        HangHoa sp15 = new Electronic("02", "May Giat", 15000000, 46,"23/03/2021", 700);
        HangHoa sp16 = new Electronic("03", "May Say", 899000, 23,"20/12/2021", 250);
        HangHoa sp17 = new Electronic("04", "May Xay Sinh To", 999000, 39,"04/11/2021", 1000);
        HangHoa sp18 = new Electronic("05", "TiVi", 5355000, 42,"01/01/2021", 1500);
        HangHoa sp19 = new Electronic("06", "May Quat", 300000, 50,"31/03/2021", 125);
        HangHoa sp20 = new Electronic("07", "May Loc Nuoc", 10000000, 66,"15/05/2021", 100);
        l.themHangHoa(sp1);
        l.themHangHoa(sp2);
        l.themHangHoa(sp3);
        l.themHangHoa(sp4);
        l.themHangHoa(sp5);
        l.themHangHoa(sp6);
        l.themHangHoa(sp7);
        l.themHangHoa(sp8);
        l.themHangHoa(sp9);
        l.themHangHoa(sp10);
        l.themHangHoa(sp11);
        l.themHangHoa(sp12);
        l.themHangHoa(sp13);
        l.themHangHoa(sp14);
        l.themHangHoa(sp15);
        l.themHangHoa(sp16);
        l.themHangHoa(sp17);
        l.themHangHoa(sp18);
        l.themHangHoa(sp19);
        l.themHangHoa(sp20);
        System.out.println("_________________________________________________");
		while(luaChon != 6){
            System.out.println("-----------------MENU CHUC NANG------------------");
            System.out.println("1.Them sua xoa hang hoa");
            System.out.println("2.Tim kiem");
            System.out.println("3.Sap xep tang dan");
            System.out.println("4.Sap xep giam dan");
            System.out.println("5.Thong ke");
            System.out.println("0.Thoat chuong trinh.");
            System.out.print(" Nhap lua chon cua ban: ");
            luaChon = input.nextInt();
            switch(luaChon){
                case 1 : {
                    System.out.println(" 1.1 Them hang hoa: ");
                    System.out.println(" 1.2 Sua hang hoa: ");
                    System.out.println(" 1.3 Xoa hang hoa: ");
                    System.out.println(" 0.  Thoat.");
                    System.out.print("Nhap lua chon cua ban: ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.themHangHoa();break;
                        case 2 : l.suaHangHoa();break;
                        case 3 : l.xoaHangHoa();break;
                        default : break;
                    }
                    break;
                }
                case 2 : {
                    System.out.println(" 2.1 Tim kiem theo loai: ");
                    System.out.println(" 2.2 Tim kiem theo ngay nhap: ");
                    System.out.println(" 2.3 Tim kiem theo gia: ");
                    System.out.println(" 0.  Thoat.");
                    System.out.print("Nhap lua chon cua ban: ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.timKiemTheoLoai();break;
                        case 2 : l.timKiemTheoNgay();break;
                        case 3 : l.timKiemTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 3 : {
                    System.out.println("    3.1 Gia nhap: ");
                    System.out.println("    3.2 Ngay nhap: ");
                    System.out.println("    3.3 Loai va ngay nhap: ");
                    System.out.println("    3.4 Loai va gia nhap: ");
                    System.out.println("    0.  Thoat.");
                    System.out.print("Nhap lua chon cua ban: ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.sapXepHangHoaTangDanTheoGia();break;
                        case 2 : l.sapXepHangHoaTangDanTheoNgay();break;
                        case 3 : l.SapXepTangDanTheoLoaiVaTheoNgayNhap();break;
                        case 4 : l.SapXepTangDanTheoLoaiVaTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 4 : {
                    System.out.println("    3.1 Gia nhap: ");
                    System.out.println("    3.2 Ngay nhap: ");
                    System.out.println("    3.3 Loai va ngay nhap: ");
                    System.out.println("    3.4 Loai va gia nhap: ");
                    System.out.println("    0.  Thoat.");
                    System.out.print("Nhap lua chon cua ban: ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.sapXepHangHoaGiamDanTheoGia();break;
                        case 2 : l.sapXepHangHoaGiamDanTheoNgay();break;
                        case 3 : l.SapXepGiamDanTheoLoaiVaTheoNgayNhap();break;
                        case 4 : l.SapXepGiamDanTheoLoaiVaTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 5 : l.thongKeTongHangHoa();break;
                default : break;
                
            }
            
        }
    }
}