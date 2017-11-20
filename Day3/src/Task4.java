
public class Task4 {
	public void findSameSymbols(String a, String b) {
		Boolean flag = true;
		char[] achar = a.toCharArray();
		char[] bchar = b.toCharArray();
		for (int i = 0; i < a.length(); i++) {
			for(int j  = 0; j < b.length(); j++) {
				if(achar[i] == bchar[j]) {
					System.out.println("Index of element " + achar[i] +" that contains in both strings: " + i + " " + j);
					flag = false;
					break;
				}
				if(!flag)
					break;
			}
		}
	}
}
