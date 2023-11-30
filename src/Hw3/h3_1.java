package Hw3;

// 請設計一個程式，使用者輸入三個數字之後，輸出結果會為正三角形&等腰三角形&其他三角形&不是三角形

import java.util.Scanner;

public class h3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入第一個邊長!");
		int a = sc.nextInt();
		System.out.println("請輸入第二個邊長!");
		int b = sc.nextInt();
		System.out.println("請輸入第三個邊長!");
		int c = sc.nextInt();
		
		if(a == b && b == c && c == a) {
			System.out.println("正三角形");
			
		}else if(a != b && b != c && a == c){
			System.out.println("等腰三角形");
			
		}else{
			System.out.println("不是三角形");
			
		}
				
		}
		
	}


