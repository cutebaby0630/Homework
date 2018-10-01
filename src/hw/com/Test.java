package hw.com;

import java.util.Random;

//矩陣相乘，矩陣皆為3*3
public class Test {

	public static void main(String[] args) {
		Random a = new Random();
		int A[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		int B[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int data[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		// 產生Source A為亂數矩陣，並且印出
		System.out.println("矩陣A：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int z = a.nextInt((10) + 1);
				A[i][j] = z;
				System.out.print(" " + A[i][j]+ "\t");
			}
			System.out.println(" ");
		}

		// Source B 為指定矩陣，印出
		System.out.println("矩陣B：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + B[i][j]+ "\t");
			}
			System.out.println("");
		}

//		兩矩陣相乘運算
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					data[i][j] += A[i][k] * B[k][j];

				}
			}

		}
//		印出運算後的矩陣
		System.out.println("運算後  ：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
