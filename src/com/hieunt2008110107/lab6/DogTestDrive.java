package lab6;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        dog.age = 1;

        Dog dog1 = new Dog("Vn", "Vàng", 10);
        dog1.nhanDang();
        dog1.Sua();

        Dog dog2 =new Dog("Indo", "Đen", 100);
        dog2.nhanDang();
        dog2.Sua();
    }
}