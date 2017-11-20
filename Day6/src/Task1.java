import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
import java.io.BufferedWriter;

public class Task1 {
	private static String fileName = "D:/Bidochka_3/Test/1.txt";
	private void  writeInFIle(String fileName) {
	String numbers = null;
	for (int i  = 0; i < 10; i++) {
		numbers += (int)(Math.random()*15);
	}
	File file = new File(fileName);
	try {
		try {
			if(!file.exists())
				file.createNewFile();
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	try (PrintWriter out = new PrintWriter(file.getAbsoluteFile())){
		out.print(numbers);
	}
	catch(IOException e) {
		throw  new RuntimeException(e);
	}
	}
	
}
