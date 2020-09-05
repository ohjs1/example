package my_project.exam1;

public class FactoryBread {
	public Bread print(String name) {
		if(name.equals("cream")) {
			return new Cream();
		} else if(name.equals("sugar")) {
			return new Sugar();
		} else if(name.equals("butter")) {
			return new Butter();
		}
		return null;
	}
}
