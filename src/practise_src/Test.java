package practise_src;

import java.util.ArrayList;

public class Test {
	private static Person p1;
	private static Person p2;
	private static Person p3;

	public static void main(String[] args) {
		p1 = new Person(0, "John", "Smith", 25, "Football",3);
		p2 = new Person(0, "Mary", "Jane", 27, "Soccer",4);
		p3 = new Person(0, "Patrick", "Bateman", 27, "Hurling",7);
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);

		for(Person p: people) {
			System.out.println(p+"\n**********************");
		}
		System.out.println(p2.getSport().getType());

	}

}
