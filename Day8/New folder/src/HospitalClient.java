import java.util.Date;
public class HospitalClient {
	public int id;
	public String name;
	public String lastname;
	public String surname;
	public long birthday;
	public String adress;
	public long lastreview;

	public HospitalClient(int id, String name, String lastname, String surname, long birthday, String adress,
						  long lastreview) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.surname = surname;
		this.birthday = birthday;
		this.adress = adress;
		this.lastreview = lastreview;
	}
}
