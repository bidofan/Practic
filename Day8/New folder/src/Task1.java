
public class Task1 {
	public void printClient(HospitalClient[] client) {
		for(int i = 0; i < client.length; i++) {
			System.out.println("Client " + i + ":");
			System.out.print("Id: " + client[i].id + "\nName: " + client[i].name + "\nLastname: " + client[i].lastname + "\nSurname: " + client[i].surname +"\nBirthday: " + client[i].birthday + "\nAdress: " + client[i].adress + "\nLastReview " + client[i].lastreview);;
		}
	}

}
