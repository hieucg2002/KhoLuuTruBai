/*
* crated date: 26 thg 9, 2021
* author: Nguyen Trong Hieu
*/
package lab2;
import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b;
		System.out.println("Nhap he so a, b theo dang ax + b = 0");

		System.out.print("He so a: ");
		a = scanner.nextDouble();

		System.out.print("He so b: ");
		b = scanner.nextDouble();

		if(a == 0)
			if(b == 0)
				System.out.println("Phuong trinh vo so nghiem\n");
			else
				System.out.println("Phuong trinh vo nghiem\n");
		else
			System.out.printf("x = %.3f\n", -b/a);
            
		scanner.close();
    }
}
