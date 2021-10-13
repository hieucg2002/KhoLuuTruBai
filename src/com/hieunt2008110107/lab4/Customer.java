package lab4;

import java.util.Scanner;

public class Customer {
    String Name;
   String Address;

    String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên khách hàng : ");
        Name = scanner.nextLine();
        return null; 
    }

    String getAddress(){
        Scanner scanner = new Scanner(System.in);
       System.out.print("Nhâp địa chỉ khách hàng : ");
       Address = scanner.nextLine();
       return null;
    }
    
    void showCustomer(){
        System.out.println("   ---Customer Information---  ");
        System.out.println(" Name :  "+Name);
        System.out.println(" Address :  "+Address);
    }
}