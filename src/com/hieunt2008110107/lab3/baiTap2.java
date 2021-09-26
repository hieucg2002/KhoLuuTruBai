/*
* crated date: 26 thg 9, 2021
* author: Nguyen Trong Hieu
*/
package lab3;

public class baiTap2 {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++){
			System.out.println();
			for(int j = 1; j <= 10; j++){
		    		System.out.printf("%d * %2d = %2d\n", i, j, i * j);
			}
		}
    }
}
