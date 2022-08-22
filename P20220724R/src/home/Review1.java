package home;

import java.util.Scanner;

public class Review1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int val = 373;

		int val2 = 373 / 100;
		int val3 = (373 - (val2 * 100// 300
		)) / 10;
		// 1.val2*100 = 3*100
		// 2.373 - val2*100 = 373 - 300
		// 3.73 / 10 = 7

		int val4 = (373 - (val2 * 100) - (val3 * 10));
		// 1.val2*100 = 3*100
		// 2.373 - val2*100 = 373 - 300
		// 3.73 - val3*10(70) = 3

		int var = -2;
		int var2 = var > 0 ? var : 0;

		if (var > 0) {
			System.out.println(var);
		} else {
			System.out.println(0);
		}

//		public int exam() {			
//			return var>0 ? var : 0;			
//		}

		int[] arr1 = { 10, 20, 30, 50, 2, 60, -3 };

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println(i + "번째 위치입니다.");
				break;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			if (i != 3) {
				System.out.println(arr1[i]);
			}
		}
		System.out.println("인덱스 입력>");
		int index = Integer.parseInt(sc.nextLine());
		arr1[index] = 100;

		int max = arr1[0];
		int min = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
			if (arr1[i] < min) {
				min = arr1[i];
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최소값 : " + min);
		
		// 클래스 타입 배열
		Product[] pro = null;
		pro = new Product[10];
		
		pro[0] = new Product();
		
		Product pro1 = new Product();
		pro[1] = pro1;
		
		
	}
}
