import java.io.*;
import java.util.*;

public class Task1 {
		public String pathf = "D:\\Bidochka_3\\Practic_OPTAM\\Files\\f.txt";
		public String pathg = "D:\\Bidochka_3\\Practic_OPTAM\\Files\\g.txt";
        public void writeToFile(String fpath) throws IOException {
            FileWriter wfile = new FileWriter(fpath);
            for (int i = 0; i < 15; i++) {
                wfile.write((int)(Math.random()* 30) +"\r\n" );
            }
            wfile.close();
        }
        public ArrayList<String> readFile(String fpath) throws IOException{
            ArrayList<String> result = new ArrayList<String>();
            FileReader rfile = new FileReader(fpath);
            Scanner sc = new Scanner(rfile);
            int i = 0;
            while(sc.hasNextLine()){
                result.add(sc.nextLine());
                i++;
            }
            sc.close();
            return result;
            
        }
        public void deleteSameNumbers(ArrayList<String> numbers, String gpath) throws IOException {
            ArrayList<String> conv = new ArrayList<String>(new HashSet<String>(numbers));
            Collections.sort(conv);
            FileWriter gwrite = new FileWriter(gpath);
            for(String i : conv) {
                gwrite.write(i + "\r\n");
            }
            gwrite.close();
        }

}
