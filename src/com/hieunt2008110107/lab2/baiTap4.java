/*
* crated date: 26 thg 9, 2021
* author: Nguyen Trong Hieu
*/
package lab2;
import java.util.Scanner;

public class baiTap4 {
    public static void main(String[] args) {
        int luaChon;
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("+---------------------------------------------------+");
			System.out.println("+		1.Giai phuong trinh bac 1	    +");
			System.out.println("+		2.Giai phuong trinh bac 2	    +");
			System.out.println("+		3.Tinh tien dien		    +");
			System.out.println("+		0.Exit				    +");
			System.out.println("+---------------------------------------------------+");

			System.out.print("Lua chon: ");
			luaChon = scanner.nextInt();

			switch(luaChon){
				case 0: 
					System.out.println("Ban chon thoat khoi chuong trinh!!!");
					break;
				
				case 1: 
					System.out.println("*---------------------------------------------------*");
					baiTap1.main(args);
					System.out.println();
					break;

				case 2: 
					System.out.println("*---------------------------------------------------*");
					System.out.println();
					baiTap2.main(args);
					break;

				case 3: 
					System.out.println("*---------------------------------------------------*");
					System.out.println();
					baiTap3.main(args);
					break;

				default :
					System.out.println("Hien tai chua co chuc nang nay!!!");
					break;
			}
		}while(luaChon != 0);

		scanner.close();
    }
}
