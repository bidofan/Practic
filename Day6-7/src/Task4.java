import java.io.*;

public class Task4 {
	public String patht = "D:\\Bidochka_3\\Practic_OPTAM\\Files\\word.txt";
	private BufferedReader reader;
    public void getAllLetters(String patht) throws IOException {
        String letters = "";
        reader = new BufferedReader(new FileReader(patht));
        char c;
        int symbol = reader.read();
        while(symbol != -1){
            c = (char)symbol;
            letters += c;
            symbol = reader.read();
        }
        reader.close();
        System.out.println(letters);
        char[] lett = letters.toCharArray();
        char tmp;
        tmp = lett[1];
		lett[1] = lett[8];
		lett[8] = tmp;
		for(char i : lett)
			System.out.print(i);
    }
}
