import java.util.Scanner;

public class ABC087B {
	public void Act() {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();

		int B = scan.nextInt();

		int C = scan.nextInt();

		int X = scan.nextInt();

		int count = 0;
		for(int a = 0; a <= A; a++) {
			for(int b = 0; b <= B; b++) {
				 for(int c = 0; c <= C; c++) {
					if((a * 500) + (b * 100) + (c * 50) == X) {
						count++;
					}
				}
			}
		}

		System.out.println(count);

		scan.close();
	}
}
