import java.util.Scanner;

public class ProjectA {

	public void Act() {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		String s = scan.next();

		System.out.println(a + b + c + " " + s);

		scan.close();
	}
}
