package my_project.exam3;

public class Factrorial {
	public static int result(int num) {
		if(num > 1) {
			return result(num - 1) * num;
		} else {
			return num;
		}
	}
	public static void main(String[] args) {
		System.out.println("펙토리얼 값 : " + result(4));
	}
}
