package polymorphism;

public class Main{
	public static void main(String[] args){
		Employee engineer = new Engineer();
		Employee sales = new Sales();
		Employee designer = new Designer();

		Employee[] employees = {
				engineer,
				sales,
				designer
		};

		for(Employee e : employees) {
			e.introduction();
		}
  }
}