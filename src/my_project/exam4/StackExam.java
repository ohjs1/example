package my_project.exam4;

public class StackExam {
	public static int factorial(int n) {
		int r = 1;
		do {
			if(n == 1) {
				return r;
			}
			r = r * n;
			n = n - 1;
			
		} while(true);
		
	}
	
	public static void main(String[] args) {
		//스택오버플로우 해결, 꼬리재귀
		System.out.println(factorial(1000000));
	}

}
