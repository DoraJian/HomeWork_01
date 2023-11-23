package hw1;

//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

public class hw1_4 {
	
	//圓周率 = 3.1415 , 半徑 = 5 , 直徑 = 10;
	//圓面積 = 圓周率 * 半徑*半徑(平方) , 圓周長 = 直徑 * 圓周率
	
	public static void main(String[] args) {
		
	    final double pi = 3.1415, radius = 5;

	        System.out.println("圓周長=" + pi * (radius * 2));
	        System.out.println("圓面積=" + pi * (radius * radius));
		
		 
	    
		
	}

}


