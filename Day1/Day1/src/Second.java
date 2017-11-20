import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		System.out.print("Please write your string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		while(str.contains("  ")) {
			 str = str.replace("  ", " ");
		}
		System.out.println("Your string without extra spaces: " + str);

	}
}