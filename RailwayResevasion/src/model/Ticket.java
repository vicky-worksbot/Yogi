package model;

public class Ticket {
	private String name;
	private int age;
	private String preference;
	private char start;
	private char end;
	private Train t;
	private int cid;
	
	
	public Ticket(String name, int age, String preference, char start, char end, Train t, int cid) {
		super();
		this.name = name;
		this.age = age;
		this.preference = preference;
		this.start = start;
		this.end = end;
		this.t = t;
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPreference() {
		return preference;
	}
	public char getStart() {
		return start;
	}
	public char getEnd() {
		return end;
	}
	public Train getT() {
		return t;
	}
	public int getCid() {
		return cid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPreference(String preference) {
		this.preference = preference;
	}
	public void setStart(char start) {
		this.start = start;
	}
	public void setEnd(char end) {
		this.end = end;
	}
	public void setT(Train t) {
		this.t = t;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Ticket [name=" + name + ", age=" + age + ", preference=" + preference + ", start=" + start + ", end="
				+ end + ", t=" + t + ", cid=" + cid + "]";
	}
	
	

}
