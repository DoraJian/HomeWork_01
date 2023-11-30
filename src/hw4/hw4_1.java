package hw4;

/*有個一維陣列如下:
{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素 */

public class hw4_1 {
	public static void main(String[] args) {
		int array[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}

		int avg = sum / array.length;
		for (int i = 0; i < array.length; i++) {

		}
		// System.out.println(sum);

		System.out.println("陣列平均值為" + avg);

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > avg) {
				count++;

			}

		}

		System.out.println("大於平均值的元素有" + count + "個");
	}

}
