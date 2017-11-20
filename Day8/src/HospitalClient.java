import java.util.Date;
public class HospitalClient {
	public int id;
	public String name;
	public String lastname;
	public String surname;
	public Date birthday;
	public String adress;
	public Date lastreview;

	public HospitalClient(int id, String name, String lastname, String surname, Date birthday, String adress,
			Date lastreview) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.surname = surname;
		this.birthday = birthday;
		this.adress = adress;
		this.lastreview = lastreview;
	}
}
