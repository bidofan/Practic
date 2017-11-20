
public class Task2 {
	public 	void valueFunc() {
		System.out.println("\tX\t\t\tY");
		for(double i = -2*3.14; i < 2*3.14; i+=0.5) {
			System.out.println("\t" + String.format("%.2f", i)  + "\t\t" + (Math.exp(i-0.8))/Math.tan(3*i));
		}
	}
}
