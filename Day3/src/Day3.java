import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		int number;
		double s, t, d;
		String first , second;
		Scanner sc = new Scanner(System.in);
		System.out.print("Write number of task, please: ");
		number = sc.nextInt();
		switch (number) {
		case 1:
			System.out.println("Write 3 numbers: ");
			s = sc.nextDouble();
			t = sc.nextDouble();
			d = sc.nextDouble();
			Task1 task1 = new Task1();
			System.out.println("Result: " + task1.findValue(s, t, d));
			break;
		case 2:
			Task2 task2 = new Task2();
			task2.valueFunc();
		case 3:
			Task3 task3 = new Task3();
			System.out.println("Write you numbers s and t: ");
			s = sc.nextDouble();
			t = sc.nextDouble();
			System.out.println("Result: " + (task3.Method(1.2, s) + task3.Method(t, s) + task3.Method((2*s - 1), s*t)));
			break;
		case 4:
			first = "Hello";
			second = "Oleksander";
			Task4 task4 = new Task4();
			task4.findSameSymbols(first, second);
			break;
		case 5:
			System.out.println("Write radius and height of ball, please: ");
			s = sc.nextDouble();
			t = sc.nextDouble();
			Task5 task5 = new Task5();
			System.out.println("The height of ball above water: " + task5.findHeightAboutWater(s, t));
			break;
		case 6:
			System.out.println("Write 2 numbers; ");
			s = sc.nextDouble();
			t = sc.nextDouble();
			Task6 task6 = new Task6();
			System.out.println("max(a, 2b) • max(2a - b, b) = " + task6.max(s, 2*t)*task6.max((2*s - t), t));
		case 7:
			first = "Taaat";
			Task7 task7 = new Task7();
			System.out.println(task7.isPalindrom(first));
		case 8:
			System.out.println("Write your number: ");
			int v = sc.nextInt();
			Task8 task8 = new Task8();
			task8.startPrime(v);
			break;
		default:
			System.out.println("You wrote wrong number of task!");
			break;
		}
		sc.close();

	}

}
