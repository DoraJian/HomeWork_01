package hw1;

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class hw1_3 {

	public static void main(String[] args) {

		int ttlsec = 256559;
		int sec = 1;
		int min = sec * 60;
		int hour = min * 60;
		int day = hour * 24;

		int ttlday = ttlsec / day; // 3600*24
		int ttlhour = (ttlsec % day) / hour; // 3600
		int ttlmin = ((ttlsec % day) % hour) / min; // 60
		int fsec = (((ttlsec % day) % hour) % min) / sec;

		System.out.println("共" + ttlday + "天" + ttlhour + "小時" + ttlmin + "分鐘" + fsec + "秒");

	}
}
