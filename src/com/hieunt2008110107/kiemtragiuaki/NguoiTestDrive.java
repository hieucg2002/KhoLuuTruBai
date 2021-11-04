package kiemtragiuaki;

public class NguoiTestDrive {
    public static void main(String[] args) {
        HocVien sv = new HocVien();
        sv.setDiemMonHoc1(5);
        sv.setDiemMonHoc2(6);
        System.out.println(sv);
        System.out.println("======================================");
        NhanVien nv = new NhanVien();
        nv.setHeSoLuong(5);
        System.out.println(nv);
        System.out.println("======================================");
        KhachHang kh = new KhachHang();
        kh.setTenCongTy("ABC");
        kh.setTriGiaDonHang(500000);
        System.out.println(kh);
        System.out.println("======================================");
    }
}
