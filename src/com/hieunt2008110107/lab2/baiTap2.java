/*
* crated date: 26 thg 9, 2021
* author: Nguyen Trong Hieu
*/
package lab2;
import java.util.Scanner;

public class baiTap2 {

    public static void phuongTrinhBac1(double a, double b){
		if(a == 0)
			if(b == 0)
				System.out.println("Phuong trinh vo so nghiem");
			else
				System.out.println("Phuong trinh vo nghiem");
		else
			System.out.printf("x = %.3f", -b/a);
	}

	public static void phuongTrinhBac2(double a, double b, double c){
		double delta;
		delta = Math.pow(b, 2) - 4 * a * c;
		if(delta < 0)
			System.out.println("Phuong trinh vo nghiem");
		else if(delta == 0){
			System.out.println("Phuong trinh co nghiem kep");
			System.out.printf("x = %.3f", -b/(2*a));
		}
		else{
			System.out.println("Phuong trinh co hai nghiem phan biet");
			double x1 = (-b + Math.sqrt(delta))/(2 * a);
			double x2 = (-b - Math.sqrt(delta))/(2 * a);
			System.out.printf("x1 = %.3f\n", x1);
			System.out.printf("x2 = %.3f\n", x2);
		}
	}

	public static void main(String[] args){
		double a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap he so a, b, c cua ax^2 + bx + c = 0");
		System.out.print("He so a: ");
		a = scanner.nextDouble();
		System.out.print("He so b: ");
		b = scanner.nextDouble();
		System.out.print("He so c: ");
		c = scanner.nextDouble();
		if(a == 0)
			phuongTrinhBac1(b, c);
		else
			phuongTrinhBac2(a,b,c);
		scanner.close();
	}

}
