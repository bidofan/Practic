import java.util.ArrayList;

public class Task4 {
	static public String[] subjects = {"Math", "Inform", "OBG", "OPTAM", "Economic"};
	public class Teacher {
		public String name;
		public String surname;
		public String subject;
		public int workExperience;
		public int weekHours;
	}

	public Teacher[] fillTeachers() {
		Teacher[] teachers = new Teacher[20];
		System.out.println("List of all Teachers: ");
		for (int i = 0; i < teachers.length; i++) {
			teachers[i] = new Teacher();
			teachers[i].name = Task3.names[(int) (Math.random() * Task3.names.length)];
			teachers[i].surname = Task1.surnames[(int) (Math.random() * Task1.surnames.length)];
			teachers[i].subject = subjects[(int) (Math.random() * subjects.length)];
			teachers[i].workExperience = 1 + (int) (Math.random() * 5);
			teachers[i].weekHours = 5 + (int) (Math.random() * 11);
			System.out.println("Name: " + teachers[i].name + "\tSubject: " + teachers[i].subject + "\tweekHours: " + teachers[i].weekHours + "\tworkExperience: " + teachers[i].weekHours);
		}
		return teachers;
	}

	public ArrayList<String> subjectSort(Teacher[] ass) {
		ArrayList<String> graduates = new ArrayList<String>();
		for (int i = 0; i < ass.length; i++) {
			if (ass[i].subject == "Inform" || ass[i].subject == "Math") {
					graduates.add(ass[i].name + "\t" + ass[i].surname + "\t" + ass[i].workExperience + "-year(s)\t" + ass[i].weekHours + "-hour(s)/week");
			}
		}
		return graduates;
	}	
}
