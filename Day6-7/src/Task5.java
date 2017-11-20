import java.util.ArrayList;

public class Task5 {
	public String path1 = "D:\\Bidochka_3\\Practic_OPTAM\\Files\\1.txt";
	public String path2 = "D:\\Bidochka_3\\Practic_OPTAM\\Files\\2.txt";
	public String path3 = "D:\\Bidochka_3\\Practic_OPTAM\\Files\\3.txt"; 
	public void equalLists(ArrayList<String> str1, ArrayList<String> str2) {
		Boolean flag = false; 
		for(int i = 0; i < str1.size(); i++) {
			if(str1.get(i) != str2.get(i)) {
				System.out.println("Index of numbers that don't coincide: " + i);
				break;
			}
			else {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Files cioncide");
		}
	}
}
