package lab6;

public class DuckTestDrive {
    public static void main(String[] args) {
        System.out.println("Count duck: " +Duck.count);
        Duck duck = new Duck(); 
        System.out.println("Count duck: " +Duck.count);
        Duck duck2 = new Duck();
        System.out.println("Count duck: " +Duck.count);
    }
}