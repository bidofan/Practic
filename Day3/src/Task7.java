
public class Task7 {
	public Boolean isPalindrom(String A){

	    String B = "";
	    String C = A.replace(" ","");
	    char[] mass = C.toCharArray();
	    char[] mass2 = new char[mass.length];
	    for ( int i = mass.length-1; i>= 0;){
	        for(int j=0;j<mass2.length; j++){
	        mass2[j] = mass[i];
	        i--;
	        B += mass2[j];

	        }
	    }
	    System.out.println(B);
	    System.out.println(C);
	    return B.equalsIgnoreCase(C);

	}
}
