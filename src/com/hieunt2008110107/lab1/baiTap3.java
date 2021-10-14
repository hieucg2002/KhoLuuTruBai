/*
* crated date: 26 thg 9, 2021
* author: Nguyen Trong Hieu
*/
package lab1;
import java.util.Scanner;

public class baiTap3 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double canh;

		System.out.print("Nhap canh hinh lap phuong: ");
		canh = scanner.nextDouble();
		double thetich = Math.pow(canh, 3);
		System.out.printf("The tich cua lap phuong = %.3f", thetich);
		scanner.close();
    }
    
}
