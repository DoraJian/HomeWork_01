package hw1;

//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

public class hw1_2 {
	public static void main(String[] args) {
		 double eggs1 = 200 , box = 12;
		 
	        System.out.println("Box=" + eggs1 / box + "盒");
	        
	        //除不盡，無法表達BOX=16盒又8顆
	        
	        int eggs2 = 200 , box2 = 12;
	        int box3 = eggs2 / box2;
	        int eggs3 = eggs2 - (box3 * box2);
	        System.out.println("總共有" + box3 + "盒" + "又" + eggs3 + "顆");
	        
	        System.out.println("總共有" + (eggs2 / box2) + "盒" + "又" + (eggs2 % box2) + "顆蛋");
	
	}
	
}

