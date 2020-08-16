import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ABC088B {
	public void Act() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		Integer[] A = new Integer[N];

		for (int i = 0; i < N; i++)
		{
			A[i] = scan.nextInt();
		}

		Arrays.sort(A, Collections.reverseOrder());

		int aTotal = 0;
		int bTotal = 0;
		int count = 1;

		for(int i = 0; i < N; i++)
		{
			if(count % 2 == 1) {
				aTotal += A[i];
			}
			else
			{
				bTotal += A[i];
			}
			count++;
		}

		// 得点差
		System.out.println(aTotal - bTotal);
		scan.close();
	}
}
