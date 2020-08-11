import java.util.Scanner;

public class ABC083B {
	public void Act()
	{
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int A = scan.nextInt();
		int B = scan.nextInt();

		int[] sum = new int[N + 1];

		for(int n = 0; n <= N; n++)
		{
				int total = 0;
				for(int x = 0, y = 1; x < String.valueOf(n).length(); x++,y++)
				{
					int s = Integer.parseInt(String.valueOf(n).substring(x, y));
					total += s;
				}
				if(A <= total && total <= B)
				{
					sum[n] = n;
				}
		}

		int result = 0;
		for(int i = 0; i < sum.length; i++)
		{
			result += sum[i];
		}

		System.out.println(result);

		scan.close();
	}
}
