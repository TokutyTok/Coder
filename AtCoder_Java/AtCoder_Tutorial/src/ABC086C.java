import java.util.Scanner;

//TODO 最後のafter_contest_01.txtが通らないため保留
public class ABC086C {
	public void Act() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int[] T = new int[N];
		int[] X = new int[N];
		int[] Y = new int[N];

		for(int i = 0; i < N; i++) {
			T[i] = scan.nextInt();
			X[i] = scan.nextInt();
			Y[i] = scan.nextInt();
		}

		String answer = "";

		for(int i = 0; i < N; i++)
		{
			if(Math.abs(T[i]) < Math.abs(X[i] + Y[i]))
			{
				answer = "No";
				break;
			}

			if(X[i] == 0 && Y[i] == 0 && Math.abs(T[i] % 2) == 1) {
				answer = "No";
				break;
			}

			if(X[i] == 0 && Y[i] == 0 && Math.abs(T[i] % 2) == 0) {
				answer = "Yes";
				continue;
			}

			if(Math.abs(X[i] + Y[i]) == 1 && Math.abs(T[i] % 2) == 0) {
				answer = "No";
				break;
			}

			if(Math.abs(T[i] - X[i] - Y[i]) % 2 == 0) {
				answer = "Yes";
			}
			else
			{
				answer = "No";
				break;
			}
		}

		System.out.println(answer);
		scan.close();
	}
}
