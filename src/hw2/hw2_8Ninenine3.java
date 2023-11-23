package hw2;

//for+while

public class hw2_8Ninenine3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			int j = 1;

			do {

				System.out.println(i + "*" + j + "=" + i * j);

				j++;

			} while (j <= 9);

			i++;
		}

	}

}
