import java.util.Scanner;

public class ABC177_A {
	public void Act()
	{
		Scanner scan = new Scanner(System.in);

		int D = scan.nextInt();
		int T = scan.nextInt();
		int S = scan.nextInt();

		int target = S * T;

		if(target >= D) {
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
		}


		scan.close();
	}
}
