package hw2;

//while + do whil

public class hw2_8_NineNine2 {

	public static void main(String[] args) {

		int i = 1;

		while (i <= 9) {
			int j = 1;
			do {
				System.out.println(i + "*" + j + "=" + i * j);

				j++;

			} while (j <= 9);

			i++;
		}

	}

}
