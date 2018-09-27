package hw.com;

//循序搜尋法 完成
//用陣列存取亂數，再用Scanner存取輸入值，用for+while做判斷
import java.util.Random;
import java.util.Scanner;

public class Sequential {

	public static void main(String[] args) {
		Random r = new Random();
		int data[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		int find = 0;
		for (int i = 0; i < 10; i++) {
			data[i] = (int) r.nextInt((10) + 1);

		}
		while (find == 0) {
			System.out.println("請輸入比對數字:");
			int num = scanner.nextInt();

			for (int i = 0; i < 10; i++) {
				if (data[i] != num) {
					System.out.println("輸入值不再資料中");
					
				} else {
					System.out.println("在第" + i + "個位置找到" + num);
					find++;
					break;
					
				}
			}

		}
		for (int i = 0; i < 10; i++) {
			System.out.print(data[i]+"\t");
		}
		
	}

}
