import java.util.ArrayList;
import java.util.Scanner;
public class Day5 {
	public static void main(String[] args) {
		int number, form;
		ArrayList<String> counter = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Write number of task, please: ");
		number = sc.nextInt();
		switch (number) {
		case 1:
			Task1 task1 = new Task1();
			task1.isMilitary(task1.fillAssosiate());
			break;
		
		case 2:
			Task2 task2 = new Task2();
			System.out.println("AVG of male's height: " + task2.isMale(task2.fillMembers()));
			break;
		case 3:
			System.out.println("Write number of school: ");
			form = sc.nextInt();
			Task3 task3 = new Task3();
			counter = task3.formSort(task3.fillStudents(), form);
			for(int i = 0; i < counter.size(); i++) {
				System.out.println(counter.get(i));
			}
			break;
		case 4:
			Task4 task4 = new Task4();
			counter = task4.subjectSort(task4.fillTeachers());
			System.out.println("Teachers of math and info: ");
			for(int i = 0; i < counter.size(); i++) {
				System.out.println(counter.get(i));
			}
			break;
		default:
			System.out.println("You wrote wrong number!");
		}
		sc.close();
	}
}
