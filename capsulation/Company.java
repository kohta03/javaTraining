package capsulation;

public class Company {

	private String name;
	private String address;
	private int NumberOfEmployees;

	public Company(String name,String address,int number) {
		this.name = name;
		this.address = address;
		this.NumberOfEmployees = number;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfEmployees() {
		return NumberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		NumberOfEmployees = numberOfEmployees;
	}



}
