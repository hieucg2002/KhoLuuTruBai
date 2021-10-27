package lab6;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh MayTinh = new MayTinh();
        int t1 = MayTinh.tong(5, 7);
        int t2 = MayTinh.tong(11, 19, 20);

        System.out.println("Gia tri tong: " +t1);
        System.out.println("Gia tri tong: " +t2);
    }
}
