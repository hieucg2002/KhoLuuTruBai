package kiemtragiuaki;

import java.security.NoSuchAlgorithmException;

public class KhachHang extends Nguoi {
    private String tenCongTy;
    private double triGiaDonHang;
    public void setTenCongTy(String tenCongTy){
        this.tenCongTy = tenCongTy;
    }
    public String getTenCongTy(){
        return this.tenCongTy;
    }
    public void setTriGiaDonHang(double triGiaDonHang){
        this.triGiaDonHang = triGiaDonHang;
    }
    public double getTriGiaDonHang(){
        return this.triGiaDonHang;
    }
    public String toString(){
        String s ; 
        s = "\nTên khách hàng : "+getHoTen() + "\n" +"Địa chỉ : "+getDiaChi() + "\nTên công ty : " + getTenCongTy() + "\n" + "Trị giá đơn hàng : " + getTriGiaDonHang();
        return s; 
    }
}
