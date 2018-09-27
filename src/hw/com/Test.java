package hw.com;

import java.util.Random;

//矩陣相乘
public class Test {

	public static void main(String[] args) {
		Random a = new Random();
		
		int A[][] ={ { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

		int B[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int data[][]={ { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		// Source Array_A
		System.out.println("矩陣A：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int z = a.nextInt((10)+1);
				A[i][j] =  z;
				System.out.print(" " + A[i][j]);
			}
			System.out.println(" ");
		}

		// Source Array_B
		System.out.println("矩陣B：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " +B[i][j]);
			}
			System.out.println("");
		}

		// result Array
		System.out.println("運算後  ：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				data[i][j] = (A[i][j] * B[i][j]);
				System.out.print(" " + data[i][j]);
			}

			System.out.println("");
		}

	}

}
