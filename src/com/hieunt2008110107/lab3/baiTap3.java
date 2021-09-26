/*
* crated date: 26 thg 9, 2021
* author: Nguyen Trong Hieu
*/
package lab3;
import java.util.Scanner;

public class baiTap3 {
    public static void main(String[] args) {
		int n, min, sum = 0;
		int[] numbers;
		Scanner scanner = new Scanner(System.in);
		numbers = new int[1000];
		System.out.print("Nhap so luong phan tu: ");
		n = scanner.nextInt();
		for(int i = 0; i < n; i++){
			System.out.printf("number[%d] = ", i);
			numbers[i] = scanner.nextInt();
		}

		System.out.println("+++Nhap mang hoan thanh+++");

		for(int i = 0; i < n-1; i++){
			for(int j = i + 1; j < n; j++)
				if(numbers[i] > numbers[j]){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
		}

		min = numbers[0];
		for(int i = 0; i < n; i++)
			if(numbers[i] < min)
				min = numbers[i];
		

		for(int i = 0; i < n; i++)
			if(numbers[i] % 3 == 0)
				sum += numbers[i];
		
		for(int i = 0; i < n; i++)
			System.out.println("number[" + i + "] = " + numbers[i]);
		System.out.println("+++Xuat mang hoan thanh+++");
		System.out.println("Gia tri nho nhat trong mang: Min = " + min);
		System.out.println("Tong cac so chia het cho 3: Tong = " + sum);
        	
		scanner.close();
	}
}
