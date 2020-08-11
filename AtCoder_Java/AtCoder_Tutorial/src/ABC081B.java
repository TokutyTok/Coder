import java.util.Scanner;

public class ABC081B {

	public void Act() {
		Scanner scan = new Scanner(System.in);

		int N =  scan.nextInt();

		int[] A = new int[N];

		for(int n = 0; n < N; n++)
		{
			A[n] = scan.nextInt();
		}

		Boolean flag = true;
		int count = 0;

		while(flag) {
		for(int n = 0; n < N; n++)
		{
			if(!(A[n] % 2 ==0)){
				flag = false;
				break;
			}

			if(A[n] % 2 == 0)
			{
				A[n] = A[n] / 2;
			}
		}
		if(flag) {
		count++;
		}
		}

		System.out.println(count);

		scan.close();
	}
}
