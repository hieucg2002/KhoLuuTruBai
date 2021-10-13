package lab5;

public class cowTestDrive {
    public static void main(String[] args) {
        cow cow;
        cow = new cow();
        
        System.out.println("========================");
        System.out.println("Can Nang : " +cow.weight);
        System.out.println("Tuoi : " +cow.age);

        cow = new cow(15);
        System.out.println("Cow trong Head co Can Nang : " +cow.weight);
    }
}