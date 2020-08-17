import java.util.Scanner;

public class ABC049C {
	public void Act() {
		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		String result = "NO";

		S = S.replace("eraser", "");
		S = S.replace("erase", "");

		S = S.replace("dreamer", "");
		S = S.replace("dream", "");

		if(S.length() == 0) {
			result = "YES";
		}

		System.out.println(result);

		scan.close();
	}
}
