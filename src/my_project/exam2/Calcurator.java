package my_project.exam2;

public class Calcurator {
	private int number;
	
	public Calcurator add(int number) {
		this.number += number;
		return this;
	}
	
	public Calcurator subtract(int number) {
		this.number -= number;
		return this;
	}
	
	public int out() {
		return this.number;
	}
}
