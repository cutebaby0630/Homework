package hw.com;

import java.util.Random;
//選擇排序
public class Selection {

	public static void main(String[] args) {
		int min, temp;
		Random r = new Random();
		int data[] = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = (int) r.nextInt((50) + 1);

		}
		for (int i = 0; i < data.length; i++) {
			// 初始化未排序序列中最小数据数组下标
			min = i;

			for (int j = i; j < data.length; j++) {
				// 在未排序元素中继续寻找最小元素，并保存其下标
				if (data[j] < data[min]) {
					min = j;
				}
			}

			// 将未排序列中最小元素放到已排序列末尾
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(data[i]+"\t");

		}
	}

}
