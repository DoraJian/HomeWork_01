package hw2;

public class hw2_7 {
	public static void main(String[] args) {
		char triangle = 'A';
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(triangle);
			}
			
			System.out.println();
			triangle++;
		}
		
	}

}
