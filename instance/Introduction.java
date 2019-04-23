package instance;

import java.util.Scanner;

public class Introduction {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("名前、出身地、年齢を入力してください");
		String name = sc.next();
		String address = sc.next();
		int age = Integer.parseInt(sc.next());

		Person1 p1 = new Person1(name, address, age);
		p1.selfIntroduction();

	}

}
