package Entity;

public class Gamer implements Entity{

	int Id;
	String firstName;
	String lastName;
	int dateOfBirth;
	Long nationalityId;
	
	
	

	
	public Gamer() {
		super();
	}

	public Gamer(int id, String firstName, String lastName, int dateOfBirth, Long nationalityId) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	
	
	public void setId(int id) {
		Id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public Long getNationalityId() {
		return nationalityId;
	}
}
