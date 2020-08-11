import java.util.Scanner;

public class ABC081A {

	public void Act()
	{
		Scanner scan = new Scanner(System.in);

		String s = scan.next();

		int sum = 0;
		for(int n =0; n < s.length(); n++)
		{
			if(s.substring(n, n + 1).equals("1"))
			{
				sum++;
			}
		}

		System.out.println(sum);

		scan.close();
	}
}
