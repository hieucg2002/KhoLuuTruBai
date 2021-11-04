package kiemtragiuaki;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy ds = new DanhSachQuanLy();
        HocVien sv = new HocVien();
        sv.setDiemMonHoc1(5);
        sv.setDiemMonHoc2(6);
        sv.setHoTen("Nguyen Trong Hieu");
        sv.setDiaChi("Can Gio");
        sv.setSoLuongHV(20);
        ds.them(sv);
        NhanVien nv = new NhanVien();
        nv.setHeSoLuong(5);
        nv.setHoTen("Nguyễn Trong Nghia");
        nv.setDiaChi("Can Gio");
        ds.them(nv);
        KhachHang kh = new KhachHang();
        kh.setTenCongTy("Java");
        kh.setTriGiaDonHang(500000);
        kh.setHoTen("Nguyễn Trong Hoang");
        kh.setDiaChi("Can Gio");
        ds.them(kh);
        ds.inDanhSach();
    }
}
