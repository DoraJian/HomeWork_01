package Hw3;

//請設計一個程式，會亂數產生0~9的數字，然後可以玩數字遊戲，猜錯會顯示錯誤訊息．猜對則顯示正確訊息

import java.util.Random;
import java.util.Scanner;

public class h3_2 {

	public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(100) + 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("猜猜數字");

		while (true) {
			int guessnumber = sc.nextInt();

			if (guessnumber > number) {
				System.out.println("數字太大囉!");
			} else if (guessnumber < number) {
				System.out.println("數字太小囉!");
			} else if (guessnumber == number) {
				System.out.println("恭喜中獎!答案就是" + number);
				break;
			}
		}

	}
}
