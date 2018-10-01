package hw.com;

import java.util.Scanner;

public class Binary {
//二分法，需要把搜尋的數列做排序
	public static void main(String[] args) {
		int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int num;
		String keyin;
		boolean a = true;
		Scanner scanner = new Scanner(System.in);
		// 讀取輸入值，回傳x的判斷值
		while (a) {
			int x = 0;
			System.out.println("輸入比對值:");
			keyin = scanner.nextLine();
			num = Integer.parseInt(keyin);
			x = binary(data, num);
			if (x == 0) {
				System.out.println("沒有找到" + num);
				a=false;
			} else {
				System.out.println("在第" + x + "個位置找到" + num);
				break;
			}
		}
		// 印出資料內容
		System.out.println("資料內容:");
		for (int i = 0; i < 9; i++) {
			System.out.print(data[i] + "\t");
		}
	}

	// 判斷輸入值在哪一個為位子
	// 先取前後兩個位置編號相加除以二，也就是中間位置，再用輸入值和中間位置中的數字比較
	public static int binary(int data[], int num) {
		int min = 0;
		int max = 8;
		while (min <= max) {
			int mid = (min + max) / 2;
			// 如果輸入值比中間值小，那就找左半邊
			if (num < data[mid]) {
				System.out.println(num + "在" + (min) + "[" + data[min] + "]及中間值" + mid + "[" + data[mid] + "]，找左半邊");
				max = mid - 1;
				// 如果輸入值比中間值大，那就找右半邊
			} else
				if (num > data[mid]) {
				System.out.println(num + "在" + (mid) + "[" + data[mid] + "]及中間值" + max + "[" + data[max] + "]，找右半邊");
				min = mid + 1;
			} else
//				如果剛好是中間值，x則回傳中間位置編號
				return mid;
		}
//		如果都沒找到，回傳X值為0
		return 0;

	}

}
