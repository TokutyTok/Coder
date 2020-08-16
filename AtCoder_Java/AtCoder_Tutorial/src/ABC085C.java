import java.util.Scanner;

public class ABC085C {
	public void Act() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int Y = scan.nextInt();

		String result = "-1 -1 -1";

		outside : for(int a = 0; a <= N; a++) {
					for(int b = 0; b <= N - a; b++) {
					 for(int c = 0; c <= N - (a + b); c++) {
				    // 必ず9
					if(a + b + c != N) {
						continue;
					}
					System.out.println(a + " " + b + " " + c );
					if((a * 10000) + (b * 5000) + (c * 1000) == Y) {
						result = a + " " + b + " " + c;
						break outside;
					}
				}
			}
		}

		System.out.println(result);

		scan.close();
	}
}
