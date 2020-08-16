import java.util.Arrays;
import java.util.Scanner;

public class ABC085B {
	public void Act() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		Integer[] A = new Integer[N];

		for (int i = 0; i < N; i++)
		{
			A[i] = scan.nextInt();
		}

		Arrays.sort(A);

		int count = 1;
		for(int i = 0; i < N - 1; i++) {
			if(A[i] < A[i + 1])
			{
				count++;
			}
		}

		System.out.println(count);
		scan.close();
	}
}
