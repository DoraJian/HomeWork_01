package hw2;

//請設計一個JAVA程式 輸出結果為下

public class hw2_6 {
	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j + "");
			}
			System.out.println();
		}
	}
}
