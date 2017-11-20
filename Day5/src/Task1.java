public class Task1 {
	static public String[] surnames = {"Ivanov", "Petrov", "Koltsov", "Kolesnik", "Melnik", "Andrienko", "Klimenko", "Yakimenko", "Lesich", "Shved", "Klichko", "Dumbazz", "Funnyman", "Tear", "Teller", "Snow", "Morrow", "Hale"};
	public Boolean[] militarys = {true, false};
 public class Assosiate {
		public String surname;
		public Boolean military;
	}
	public Assosiate[] fillAssosiate() {
		Assosiate[] assosiates= new Assosiate[10];
        System.out.println("List of all colaborators: ");
            for(int i = 0; i < assosiates.length; i ++) {
                assosiates[i] = new Assosiate();
                assosiates[i].surname = surnames[i];
                assosiates[i].military = militarys[(int)(Math.random()*militarys.length)];
                System.out.println("Surname: " + assosiates[i].surname +"\t" + "Military: " + assosiates[i].military);
            }
            return assosiates;
	}
	public void isMilitary(Assosiate[] ass){
        System.out.println("Militarys: ");
        for(int i = 0; i < ass.length; i++){
            if(ass[i].military == true) {
                System.out.println(ass[i].surname);
            }
            }
        }
}
