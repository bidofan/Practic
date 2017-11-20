import java.util.ArrayList;

public class Task3 {
	static public String[] names = { "Ivan", "Igor", "Vadim", "Artem", "John", "James", "Cley", "Tig", "Brand" };
	public String[] adresses = { "Kirova 110", "Shevchenka 5", "Shevchenka 245", "Sagaidachnogo 130",
			"Sagaidachnogo 130", "Rakina 83", "Rashova 82" };

	public class Student {
		public String name;
		public String surname;
		public String adress;
		public int school;
		public int form;
	}

	public Student[] fillStudents() {
		Student[] students = new Student[20];
		System.out.println("List of all Students: ");
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].name = names[(int) (Math.random() * names.length)];
			students[i].surname = Task1.surnames[(int) (Math.random() * Task1.surnames.length)];
			students[i].adress = adresses[(int) (Math.random() * adresses.length)];
			students[i].school = 1 + (int) (Math.random() * 5);
			students[i].form = 5 + (int) (Math.random() * 11);
			System.out.println("Form: " + students[i].form + "   School: " + students[i].form + "   Name: " + students[i].name);
		}
		return students;
	}

	public ArrayList<String> formSort(Student[] ass, int form) {
		ArrayList<String> graduates = new ArrayList<String>();
		for (int i = 0; i < ass.length; i++) {
			if (ass[i].school == form) {
				if (ass[i].form >= 10) {
					graduates.add(ass[i].name + " " + ass[i].surname + " " + ass[i].adress);
				}
			}
		}
		return graduates;
	}
}
