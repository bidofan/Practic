public class Day8 {
	public static void main(String[] args) {
		String[] names = { "Ivan", "Igor", "Vadim", "Artem", "John", "James", "Cley", "Tig", "Brand" };
		String[] lastnames = { "Ivanov", "Petrov", "Koltsov", "Kolesnik", "Melnik", "Andrienko", "Klimenko",
				"Yakimenko", "Lesich", "Shved", "Klichko", "Dumbazz", "Funnyman", "Tear", "Teller", "Snow", "Morrow",
				"Hale" };
		String[] surnames = { "Ivanovish", "Petrovich", "Igorovich", "Vadimovich", "Artemovich", "Johnovich", "Jamesovich", "Cleyvich", "Tigovich", "Brandovich"};
		String[] adresses = { "Kirova 110", "Shevchenka 5", "Shevchenka 245", "Sagaidachnogo 130", "Sagaidachnogo 130",
				"Rakina 83", "Rashova 82" };
		Task1 task1 = new Task1();
		HospitalClient[] client = new HospitalClient[15];
		for(int i = 0; i < client.length; i++) {
			client[i] = new HospitalClient(i, names[(int)(Math.random()*names.length)], lastnames[(int) (Math.random()*lastnames.length)], surnames[(int) (Math.random()*surnames.length)], client[i].birthday.UTC(1999, 12, 13, 13, 45, 15) ,adresses[(int) (Math.random()*adresses.length)], client[i].lastreview.UTC(1999, 12, 13, 13, 45, 15)) )
		}
	}
}
