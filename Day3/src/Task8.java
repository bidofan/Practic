
public class Task8 {
	public void isPrime(int a, int b) {
		if(a == 1)
			System.out.println("Prime");
		else 
			if(b % a == 0)
				System.out.println("Not prime(");
		else
			isPrime(a-1, b);
	}
	public void startPrime(int n) {
		isPrime(n-1, n);
	}
}
