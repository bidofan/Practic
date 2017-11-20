import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		switch (number) {
		case 1:
			int[] values = { 5, 20, 23, 30, 5, 20, 18, 8, 27, 8};
			Task1 task1 = new Task1();
			task1.delSamSymbols(values);
			break;
		case 2: 
			Task2 task2 = new Task2();
			task2.m = sc.nextInt();
			task2.n = sc.nextInt();
			task2.tansoformToArray(task2.m, task2.n);
			break;
		case 3:
			Task3 task3 = new Task3();
			task3.a = sc.nextInt();
			task3.b = sc.nextInt();
			task3.c = sc.nextInt();
			task3.matrixProjection(task3.fillMart(task3.a, task3.b, task3.c));
			break;
		case 4:
			Task4 task4 = new Task4();
			int[][] arr = {{5, 4, 3}, {3, 9, 1}, {4, 6, 7}};
			task4.multA(arr);
			break;
		default:
			System.out.println("You wrote wrong number of task!");
			break;
		}
		sc.close();
	}

}
