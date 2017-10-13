package practise_src;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int id=1;
	private String fName;
	private String lName;
	private int age;
	private Sport sport;
	private int x;

	public Person(int id, String fName, String lName, int age, String sport, int i) {
		super();
		x = Person.id++;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.sport =new Sport(sport, i);

	}



	@Override
	public String toString() {
		return " ID = "+x+"\n First Name = " + fName + ",\n Last Name = " + lName + ",\n Age = " + age + ",\n "+getfName()+" " + sport ;
	}



	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}



	public static int getId() {
		return id;
	}



	public static void setId(int id) {
		Person.id = id;
	}


}
