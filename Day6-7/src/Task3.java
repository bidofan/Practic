import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
	public String patht = "D:\\Bidochka_3\\Practic_OPTAM\\Files\\text.txt";
    public void getAllWords(String patht, int n) throws FileNotFoundException {
        ArrayList<String> allwords = new ArrayList<String>();
        FileReader read = new FileReader(patht);
        Scanner sc = new Scanner(read);
        while(sc.hasNextLine()){
            allwords.add(sc.nextLine());
        }
        System.out.println("First element: " + allwords.get(0));
        System.out.println("Fourth element: " + allwords.get(4));
        if(n <= allwords.size()) {
            System.out.println("N element: " + allwords.get(n));
        }
        else{
            System.out.println("There is no such element");
        }
        System.out.println("Last element: " + allwords.get(allwords.size()-1));
        sc.close();
    }
}
