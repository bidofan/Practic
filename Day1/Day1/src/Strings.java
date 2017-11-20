import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		int counter = 0;
		System.out.print("Please write your string: ");
		Scanner si = new Scanner(System.in);
		String str = si.nextLine();
		si.close();
		char[] cstr = str.toCharArray();
		for(char i : cstr) {
			if(((i >= 'a')&&(i <= 'z')) || ((i >= 'A')&&(i <= 'Z'))) {
					counter++;
			}
		}
		System.out.println("the number of English letter is: " + counter);
		
	}
}

