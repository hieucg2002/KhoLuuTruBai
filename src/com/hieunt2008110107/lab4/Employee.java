package lab4;

import java.util.Scanner;

public class Employee {
    String Name;
    String Slary;

    String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên nhan vien : ");
        Name = scanner.nextLine();
        return null;
    }

    String getSalary(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Lương nhan vien : ");
        Slary = scanner.nextLine();
        return null;
    }
    
    void showEmloyee(){  
        System.out.println("Tên nhân viên :" +Name);
        System.out.println("Lương : " +Slary);
    }
}
