package lab6;

public class Dog {
    //attribute: Biết j về chó
    String breed; //(Biến State/Biến Trạng Thái)
    String color; //(Biến State/Biến Trạng Thái)
    int age;      //(Biến State/Biến Trạng Thái)

    //method

    //constructor 
    Dog(){
        nhanDang();
        Sua();
    }
    void nhanDang(){
        System.out.println("Giong: " +breed);  //NULL
        System.out.println("Mau sac: " +color); //NULL
        System.out.println("Tuoi: " +age);
    }
    void Sua(){
        int sua = 3;
        System.out.println("so lan Chó sua: " +sua);
        System.out.println("Gâuuuuuuuuuuuu");
        System.out.println("================");
    }

    //constructor 2
    Dog(String b, String c, int a){
       breed = b;
       color = c;
       age = a; 
    }
}