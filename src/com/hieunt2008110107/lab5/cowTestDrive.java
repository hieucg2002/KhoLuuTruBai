package lab5;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        
        cow = new Cow();
        
        System.out.println("========================");
        System.out.println("Can Nang : " +cow.weight);
        System.out.println("Tuoi : " +cow.age);

        cow = new Cow(15);
        System.out.println("Cow trong Head co Can Nang : " +cow.weight);

        cow = new Cow(10, 1);
        System.out.println("Cân nặng : " +cow.weight);
        System.out.println("Tuổi : " +cow.age);
    }
}