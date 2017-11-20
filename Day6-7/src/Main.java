import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int number, index;
        Scanner in = new Scanner(System.in);
        System.out.print("Write number of task: ");
        number = in.nextInt();
        switch(number) {
            case 1:
                Task1 task1 = new Task1();
                task1.writeToFile(task1.pathf);
                task1.deleteSameNumbers(task1.readFile(task1.pathf), task1.pathg);
                break;
            case 3:
                Task3 task3 = new Task3();
                Scanner scan = new Scanner(System.in);
                System.out.print("Write number of element: ");
                index = scan.nextInt();
                task3.getAllWords(task3.patht, index);
                scan.close();
                break;
            case 4:
                Task4 task4 = new Task4();
                task4.getAllLetters(task4.patht);
                break;
            case 5: 
            	Task1 task11 = new Task1();
            	Task5 task5 = new Task5();
            	task11.writeToFile(task5.path1);
            	task11.writeToFile(task5.path2);
            	task5.equalLists(task11.readFile(task5.path1),task11.readFile(task5.path2));            	
            	break;
            default:
                System.out.println("U wrote wrong number!");
        }
    }
}
