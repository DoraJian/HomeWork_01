package hw1;

/*FV = PV * ((1 + i), n) 
   FV（Future Value）：未來的價值，也就是最後的金額1。
   PV（Present Value）：現值，也就是本金1。
	i：利率或預期的回報率1。
	n：期數1。*/

public class hw1_5 {

	public static void main(String[] args) {

		double money = 150_000_000;
		double rate = 0.02;
		int year = 10;

	    double FV = money * Math.pow((1 + rate), year); 
		System.out.println("本金加利息共有" + money + "元");

 }
}
