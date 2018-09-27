package hw.com;

import java.io.IOException;
import java.util.Scanner;
//二分法
public class BinaryFind {

	public static void main(String[] args) throws IOException {
		int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int num;
		String keyin;
		boolean a = true;
		Scanner scanner = new Scanner(System.in);
		while (a) {
			int x=0;
			System.out.println("輸入比對值:");
			keyin = scanner.nextLine();
			num = Integer.parseInt(keyin);
			x=binary(data, num);
			if(x==0) {
				System.out.println("沒有找到"+num);
				break;
			}
			else {
				System.out.println("在第" + x + "個位置找到" + num);
				break;
			}
		}
		System.out.println("資料內容:");
		for (int i = 0; i < 9; i++) {
			System.out.print(data[i]+"\t");
		}
	}

	public static int binary(int data[], int num) {
		int min = 0;
		int max = 8;
		while (min <= max && num != -1) {
			int mid = (min + max) / 2;
			if (num < data[mid]) {
				System.out.println(num + "在" + (min) + "[" + data[min] + "]及中間值" + mid + "[" + data[mid] + "]，找左半邊");
				max = mid - 1;
			} else if (num > data[mid]) {
				System.out.println(num + "在" + (mid) + "[" + data[mid] + "]及中間值" + max + "[" + data[max] + "]，找右半邊");
				min = mid + 1;
			} else
				return mid;
		}
		return 0;

	}
}
