package hw.com;

import java.util.Random;
//選擇排序:反覆從未排序的數列中取出最小的元素，印出結果即為已排序的數列。
public class Selection {

	public static void main(String[] args) {
		int min, temp;
		Random r = new Random();
		int data[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			data[i] = (int) r.nextInt((50) + 1);

		}
		System.out.println("未排序數列:");
		for (int i = 0; i < 10; i++) {
			
			System.out.print(data[i]+"\t");

		}
		System.out.println(" ");
		for (int i = 0; i < data.length; i++) {
			//未排序的數列中，最左邊的位置，與其他位置中的亂數做比較 
			min = i;
			for (int j = i; j < data.length; j++) {
				// 比較後，較小的保留它的編號
				if (data[j] < data[min]) {
					min = j;
				}
			}
			// 把最小數與比較中最左邊的數做交換
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
//		印出排序好的數列
		System.out.println("已排序數列:");
		for (int i = 0; i < 10; i++) {
			
			System.out.print(data[i]+"\t");

		}
	}

}
