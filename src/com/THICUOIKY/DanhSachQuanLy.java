package com.THICUOIKY;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class DanhSachQuanLy {
    private static final int Comparator = 0;
    private ArrayList<HangHoa> list ;
    private Scanner input = new Scanner(System.in);
    DanhSachQuanLy(){
        list = new ArrayList<HangHoa>(30);
    }
    public ArrayList<HangHoa> getList() {
        return list;
    }
    public void setList(ArrayList<HangHoa> list) {
        this.list = list;
    }
    public void themHangHoa(HangHoa x) throws ParseException{
        int count = 0 ;
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa sp = list.get(i);
            if(sp.getMaHang().equalsIgnoreCase(x.getMaHang()) ||
            sp.getMaHang().equalsIgnoreCase("HTP-")||sp.getMaHang()
            .equalsIgnoreCase("HSS-") || sp.getMaHang().equalsIgnoreCase("HDM-") ){
                System.out.println("ERROR !");
                count++ ;
                themHangHoa();
                break;
            }
        }
        if(count == 0){
            list.add(x);
        }
    }
    public void themHangHoa() throws ParseException {
        System.out.println(" 1.Vegettable: ");
        System.out.println(" 2.International: ");
        System.out.println(" 3.Electronic: ");
		System.out.println(" 0.Back: ");
        System.out.print("Chon chuc nang: ");
    	int luaChon = input.nextInt();
        HangHoa x;
        switch(luaChon){
            case 1 : {
                System.out.print("Nhap ma hang hoa: ");
				input.nextLine();
				String maHH = input.nextLine();
				System.out.print("Nhap ten hang hoa: ");
				String tenHH = input.nextLine();
				System.out.print("Nhap so luong ton kho: ");
				int soLuongTonKho = input.nextInt();
				System.out.print("Nhap don gia: ");
				int donGia = input.nextInt();
				System.out.print("Nhap ngay nhap kho: ");
                input.nextLine();
				String ngayNK = input.nextLine();
                System.out.print("Nhap ngay het han: ");
				String ngayHH = input.nextLine();
				x = new Vegetable( maHH, tenHH , donGia , soLuongTonKho , ngayNK , ngayHH );
				themHangHoa(x);
                break;
            }
			case 2 : {
                System.out.print("Nhap ma hang hoa: ");
				input.nextLine();
				String maHH = input.nextLine();
				System.out.print("Nhap ten hang hoa: ");
				String tenHH = input.nextLine();
				System.out.print("Nhap so luong ton kho: ");
				int soLuongTonKho = input.nextInt();
				System.out.print("Nhap don gia: ");
				int donGia = input.nextInt();	
				System.out.print("Nhap ngay nhap kho: ");
                input.nextLine();
				String ngayNK = input.nextLine();
                System.out.print("Nhap nha cung cap: ");
                String nhaCC = input.nextLine();
				x = new International(maHH, tenHH, donGia , soLuongTonKho , ngayNK , nhaCC);
                themHangHoa(x);
                break;
			}
			case 3 : {
                System.out.print("Nhap ma hang hoa: ");
				input.nextLine();
				String maHH = input.nextLine();
				System.out.print("Nhap ten hang hoa: ");
				String tenHH = input.nextLine();
				System.out.print("Nhap so luong ton kho: ");
				int soLuongTonKho = input.nextInt();
				System.out.print("Nhap don gia: ");
				int donGia = input.nextInt();	
				System.out.print("Nhap ngay nhap kho: ");
                input.nextLine();
				String ngayNK = input.nextLine();
                System.out.print("Nhap cong suat thiet bi: ");
                int congSuat =input.nextInt();
				x = new Electronic(maHH, tenHH , donGia , soLuongTonKho,ngayNK, congSuat) ;
				themHangHoa(x);
                break;
			}
			default : break;
        } 
	}
    public void suaHangHoa() throws ParseException{
        System.out.print("Nhap ma hang hoa cua hang can sua : ");
        String maHang = input.nextLine();
        for(int i = 0 ; i< list.size();i++){
            HangHoa x = list.get(i);
            if(x.getMaHang().equals(maHang)){
                if(x instanceof Vegetable){
                    String[] maHH = maHang.split("------------------------------",2);
                    System.out.print("Nhap ten hang hoa: ");
                    String tenHH = input.nextLine();
                    System.out.print("Nhap so luong ton kho: ");
                    int soLuongTonKho = input.nextInt();
                    System.out.print("Nhap don gia: ");
                    int donGia = input.nextInt();	
                    System.out.print("Nhap ngay nhap kho: ");
                    input.nextLine();
                    String ngayNK = input.nextLine();
                    System.out.print("Nhap ngay het han: ");
                    String ngayHH = input.nextLine();
                    HangHoa a = new Vegetable( maHH[1], tenHH , donGia , 
                    soLuongTonKho , ngayNK , ngayHH );
                    list.add(list.indexOf(x),a);
                    list.remove(x);
                }
                else if(x instanceof International){
                    String[] maHH = maHang.split("----------------------------------",2);
                    System.out.print("Nhap ten hang hoa: ");
                    String tenHH = input.nextLine();
                    System.out.print("Nhap so luong ton kho: ");
                    int soLuongTonKho = input.nextInt();
                    System.out.print("Nhap don gia: ");
                    int donGia = input.nextInt();				
                    System.out.print("Nhap ngay nhap kho: ");
                    input.nextLine();
                    String ngayNK = input.nextLine();
                    System.out.print("Nhap nha cung cap: ");
                    String nhaCC = input.nextLine();
                    HangHoa a = new International(maHH[1], tenHH, donGia , soLuongTonKho , 
                    ngayNK , nhaCC);
                    list.add(list.indexOf(x),a);
                    list.remove(x);
                }
                else if(x instanceof Electronic){
                    String[] maHH = maHang.split("-------------------------------",2);
                    System.out.print("Nhap ten hang hoa: ");
                    String tenHH = input.nextLine();
                    System.out.print("Nhap so luong ton kho: ");
                    int soLuongTonKho = input.nextInt();
                    System.out.print("Nhap don gia: ");
                    int donGia = input.nextInt();				
                    System.out.print("Nhap ngay nhap kho: ");
                    input.nextLine();
                    String ngayNK = input.nextLine();
                    System.out.print("Nhap cong suat thiet bi: ");
                    int congSuat =input.nextInt();
                    HangHoa a = new Electronic(maHH[1], tenHH , donGia , soLuongTonKho,
                    ngayNK, congSuat) ;
                    list.add(list.indexOf(x),a);
                    list.remove(x);
                }
            }
        }
    }
    public void xoaHangHoa(){
        System.out.print("Nhap ma hang hoa can xoa: ");
		String maHH = input.nextLine();
		for(int i = 0 ; i <list.size() ; i++){
            HangHoa x = list.get(i);
            if(x.getMaHang().equals(maHH)){
                list.remove(x);
            }
        }
    }
    public void xuatVetgetable(){
		for (int i =0; i< 149; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Ngay het han","Tong gia tri");
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
        for (HangHoa hangHoa : list) {
            if(hangHoa instanceof Vegetable){
                System.out.println(hangHoa);
            }
        }
        for (int i =0; i< 149; i++) {
		}
        System.out.println();

    }
    public void xuatInternational(){
		for (int i =0; i< 149; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Xuat xu","Tong gia tri");
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
        for (HangHoa hangHoa : list) {
            if(hangHoa instanceof International){
                System.out.println(hangHoa);
            }
        }
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
    }
    public void xuatElectronic(){
		for (int i =0; i< 149; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Cong suat","Tong gia tri");
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
        for (HangHoa hangHoa : list) {
            if(hangHoa instanceof International){
                System.out.println(hangHoa);
            }
        }
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
    }
    public void xuatVegetable(HangHoa x){
		for (int i =0; i< 149; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Ngay het han","Tong gia tri");
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 149; i++) {
		}
        System.out.println();

    }
    public void xuatInternationalTrucTiep(HangHoa x){
		for (int i =0; i< 149; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Xuat xu","Tong gia tri");
        for (int i =0; i< 149; i++) {
        }
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
    }
    public void xuatElectronicTrucTiep(HangHoa x){
		for (int i =0; i< 149; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Cong suat","Tong gia tri");
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
    }
    public void xuatVegetableTheoDanhSach(ArrayList<HangHoa> l){
		for (int i =0; i< 149; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Ngay het han","Tong gia tri");
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);
        }
        for (int i =0; i< 149; i++) {
		}
        System.out.println();

    }
    public void xuatInternationalTheoDanhSach(ArrayList<HangHoa> l){
		for (int i =0; i< 149; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Xuat xu","Tong gia tri");
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);
        }
        for (int i =0; i< 149; i++) {
		}
        System.out.println();

    }
    public void xuatElectronicTheoDanhSach(ArrayList<HangHoa> l){
		for (int i =0; i< 149; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Cong suat","Tong gia tri");
        for (int i =0; i< 149; i++) {;
		}
        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);
        }
        for (int i =0; i< 149; i++) {
		}
        System.out.println();
    }
    public void xuatTatCa(){
        for(int i = 0 ; i < list.size() ; i++){
           HangHoa x = list.get(i);
            if(x instanceof Vegetable){
                xuatVegetable(x);
            }
            else if(x instanceof International){
                xuatInternationalTrucTiep(x);
            }
            else if(x instanceof Electronic){
                xuatElectronicTrucTiep(x);
            }
        }
    }
    public void sapXepHangHoaGiamDanTheoGia(){
        Collections.sort(list,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
    }
    public void sapXepHangHoaTangDanTheoGia(){
        Collections.sort(list,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
    }
    public void sapXepHangHoaTangDanTheoNgay(){
        Collections.sort(list,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return -1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
    }
    public void sapXepHangHoaGiamDanTheoNgay(){
        Collections.sort(list,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
    }
    public void SapXepTangDanTheoLoaiVaTheoNgayNhap(){
        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof Vegetable){
                list1.add(x);
            }
            else if(x instanceof International){
                list2.add(x);
            }
            else if(x instanceof Electronic){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return -1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatVegetableTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return -1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatInternationalTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return -1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatElectronicTheoDanhSach(list3);
    }
    public void SapXepGiamDanTheoLoaiVaTheoNgayNhap(){
        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof Vegetable){
                list1.add(x);
            }
            else if(x instanceof International){
                list2.add(x);
            }
            else if(x instanceof Electronic){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatVegetableTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatInternationalTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatElectronicTheoDanhSach(list3);
    }
    public void SapXepTangDanTheoLoaiVaTheoGia(){
        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof Vegetable){
                list1.add(x);
            }
            else if(x instanceof International){
                list2.add(x);
            }
            else if(x instanceof Electronic){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatVegetableTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatInternationalTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatElectronicTheoDanhSach(list3);
    }
    public void SapXepGiamDanTheoLoaiVaTheoGia(){
        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof Vegetable){
                list1.add(x);
            }
            else if(x instanceof International){
                list2.add(x);
            }
            else if(x instanceof Electronic){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatVegetableTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatInternationalTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatElectronicTheoDanhSach(list3);
    }
    public void timKiemTheoLoai(){
        int luaChon = 0;
		System.out.println(" 1.VEGETABLE: ");
		System.out.println(" 2.INTERNATIONAL: ");
		System.out.println(" 3.ELECTRONIC: ");
        System.out.print("Nhap lua chon cua ban:");
		luaChon = input.nextInt();
		switch(luaChon){
			case 1 :{System.out.println("VEGETABLE:");
					 xuatVetgetable();
					 break;
					}
			case 2 :{System.out.println("INTERNATIONAL: ");
					 xuatInternational();
					 break;
					}
			case 3 :{System.out.println("ELECTRONIC:");
					 xuatElectronic();
					 break;
					}
		}
    }
    public void timKiemTheoNgay() throws ParseException{
        System.out.println("Thoi gian can tim kiem tu ngay: ");
		String ngayBatDau = input.nextLine();
		System.out.println(" den ngay :");
		String ngayKetThuc = input.nextLine();
		System.out.println("CAC LOAI HANG DA NHAP KHO TU NGAY " + ngayBatDau +
        " DEN NGAY " + ngayKetThuc + " LA :");
        for(int i = 0 ; i<list.size() ; i++){
            HangHoa x = list.get(i);
            if(x.getNgayNhapKho().compareTo(chuyenChuoiSangNgay(ngayBatDau)) >= 0 &&
            x.getNgayNhapKho()
            .compareTo(chuyenChuoiSangNgay(ngayKetThuc))<=0  ){
                if(x instanceof Vegetable){
                    xuatVegetable(x);
                }
                else if(x instanceof International){
                    xuatInternationalTrucTiep(x);
                }
                else if(x instanceof Electronic){
                    xuatElectronicTrucTiep(x);
                }
            }
        }
    }
    public void timKiemTheoGia(){
        System.out.println("Gia can tim kiem tu: ");
		long giaBatDau = input.nextInt();
		System.out.println(" den: ");
		long giaKetThuc = input.nextInt();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x.getGiaNhap() >= giaBatDau && x.getGiaNhap() <= giaKetThuc){
                if(x instanceof Vegetable){
                    xuatVegetable(x);
                }
                else if(x instanceof International){
                    xuatInternationalTrucTiep(x);
                }
                else if(x instanceof Electronic){
                    xuatElectronicTrucTiep(x);
                }
            }
        }
    }
    public static Date chuyenChuoiSangNgay(String chuoiNgay) throws ParseException{
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(chuoiNgay);
        return date;
    }
    DecimalFormat ft = new DecimalFormat("###,###,### VND");
    public void thongKeTongHangHoa(){
        long tongSoLuong = 0 ,tongChiPhi = 0;
        for (HangHoa hangHoa : list) {
            tongSoLuong += hangHoa.getSoLuongTonKho();
            tongChiPhi += hangHoa.tinhTien();
        }
		SapXepTangDanTheoLoaiVaTheoGia();
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-30s|%-100d|\n","Tong so luong hang trong kho",tongSoLuong);
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-30s|%-25s%-67s%-20s|\n","Tong chi phi hang trong kho",
        " "," ",ft.format(tongChiPhi));
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
    }
}