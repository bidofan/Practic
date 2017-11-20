import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		int pluscounter = 0, starcounter = 0, counter = 0;
		System.out.print("Please write your string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		char[] cstr = str.toCharArray();
		for(char i : cstr) {
			if(i == '+') { 
				pluscounter++;
				counter++;
			}
			else 
				if(i == '*') {
					starcounter++;
					counter++;
				}
			else 
				if(i == '-')
					counter++;
		}
		System.out.println("Number of '+' symbols in string: " + pluscounter);
		System.out.println("Number of '*' sumbols in string: " + starcounter);
		System.out.print("Number of '+' '*' '-' symbols in string: " + counter);
	}

}
