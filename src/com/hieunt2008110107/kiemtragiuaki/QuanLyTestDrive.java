package kiemtragiuaki;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy ds = new DanhSachQuanLy();
        HocVien sv = new HocVien();
        sv.setDiemMonHoc1(5);
        sv.setDiemMonHoc2(6);
        sv.setHoTen("Nguyễn Văn A");
        sv.setDiaChi("1 Nguyễn Văn Mại , p4 , Q.Tân Bình");
        sv.setSoLuongHV(20);
        ds.them(sv);
        NhanVien nv = new NhanVien();
        nv.setHeSoLuong(5);
        nv.setHoTen("Nguyễn Văn B");
        nv.setDiaChi("2 Nguyễn Văn Mại , p4 , Q.Tân Bình");
        ds.them(nv);
        KhachHang kh = new KhachHang();
        kh.setTenCongTy("ABC");
        kh.setTriGiaDonHang(500000);
        kh.setHoTen("Nguyễn Văn C");
        kh.setDiaChi("3 Nguyễn Văn Mại , p4 , Q.Tân Bình");
        ds.them(kh);
        ds.inDanhSach();
    }
}
