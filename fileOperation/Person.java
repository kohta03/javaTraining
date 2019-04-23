public class Person {

	private long id; //ID
	private String lastName; // 名字
	private String firstName; // 名前
	private int age; // 年齢

	public Person(long id, String lastName, String firstName, int age) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "]";
	}

	public String commaSeparate() {
		String[] str = new String[4];
		str[0] = String.valueOf(this.id);
		str[1] = this.lastName;
		str[2] = this.firstName;
		str[3] = String.valueOf(this.age);
		return String.join(",", str);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}