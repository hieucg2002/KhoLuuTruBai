/*
* crated date: 26 thg 9, 2021
* author: Nguyen Trong Hieu
*/
package lab3;
import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {

		int n, count = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap so can kiem tra: ");
		n = scanner.nextInt();

		if(n < 2)
			System.out.printf("So %d khong phai so nguyen to\n", n);
		else{
			double canbac = Math.sqrt(n);
			for(int i = 2; i <= canbac; i++)
				if(n % i == 0)
					count ++;
		}
        
		if(count == 0)
			System.out.printf("%d la so nguyen to\n", n);
		else
			System.out.printf("%d khong phai so nguyen to\n", n);

		scanner.close();
	}
}
