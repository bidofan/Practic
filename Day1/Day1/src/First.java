import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		int counter = 0;
		System.out.print("Please write your string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		char[] cstr = str.toCharArray();
		for(char i : cstr) {
			if(i == 'b' || i == 'B') {
				if(i++ != ' ')
					counter++;
			}
		}
		System.out.println("Number of words that begion on symbol 'b' is: " + counter);

	}

}
