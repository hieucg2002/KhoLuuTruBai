/*
* crated date: 26 thg 9, 2021
* author: Nguyen Trong Hieu
*/
package lab1;
import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ho va ten: ");
		String hoTen = scanner.nextLine();
		System.out.print("Diem TB: ");
		double diemTB = scanner.nextDouble();

		System.out.printf("%s %.2f diem", hoTen, diemTB);
		scanner.close();
	}
}
