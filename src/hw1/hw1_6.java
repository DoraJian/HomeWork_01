package hw1;

/*請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
5 + 5
5 + ‘5’
5 + “5”
並請用註解各別說明答案的產生原因*/

public class hw1_6 {

	public static void main(String[] args) {

		System.out.println(5 + 5);
		System.out.println(5 + '5');
		System.out.println(5 + "5");

		// 一般整數字面計算
		// '5' = UNICODE/ASCII碼十進制 = 53
		// ""→為文字顯示,故為5+5(文字)

	}

}
