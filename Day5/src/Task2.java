public class Task2 {
	String[] genders = {"Male", "Female"};
	 public class Member {
		 	public String gender;
		 	public int heigth;
		}
		public Member[] fillMembers() {
			Member[] members = new Member[14];
	        System.out.println("List of all members: ");
	            for(int i = 0; i < members.length; i++) {
	                members[i] = new Member();
	                members[i].gender = genders[(int)(Math.random()*2)];
	                members[i].heigth = 100 + (int)(Math.random() * 190);
	                System.out.println("Member" + i + " Gender: " + members[i].gender + "    Height: " + members[i].heigth);
	            }
	            return members;
		}
		public double isMale(Member[] ass){
			double avg = 0, counter = 0;
	        for(int i = 0; i < ass.length; i++){
	            if(ass[i].gender == "Male") {
	                avg += ass[i].heigth;
	                counter++;
	            }
	        }
	        return avg/counter;
		}
}
