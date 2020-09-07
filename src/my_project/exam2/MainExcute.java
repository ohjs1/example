package my_project.exam2;

public class MainExcute {
	
	public static void main(String[] args) {
		Calcurator cal = new Calcurator();
		int n = cal.add(4).add(5).subtract(3).out();
		
		System.out.println(n);
	}

}
