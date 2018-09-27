package hw.com;

import java.util.Scanner;

public class Test1 {
	static int num(int n) {
		if (n == 0)
			return 1;
		else
			return n * num(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("請輸入要求階乘數:"); 
		Scanner scanner = new Scanner(System.in); 
		int a = scanner.nextInt(); 
		System.out.println(a +  "的階乘結果是：" +num(a)); 
		} 
	}


