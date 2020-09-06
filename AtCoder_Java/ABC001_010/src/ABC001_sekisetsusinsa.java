import java.util.Scanner;

public class ABC001_sekisetsusinsa {
	public void Act() {
		Scanner scan = new Scanner(System.in);

		int H1 = scan.nextInt();
		int H2 = scan.nextInt();

		System.out.println(H1 - H2);
		scan.close();
	}
}
