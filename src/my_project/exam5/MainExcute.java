package my_project.exam5;

public class MainExcute {

	public static void main(String[] args) {
		
		int[][] arr = {
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 1, 1, 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
		};
		
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j] != 0) {
					cnt++;
					
					//상하좌우검사해서 물깊이 1증가
					if(arr[i][j] >= arr[i][j-1] && arr[i][j] >= arr[i-1][j] 
							&& arr[i][j] >= arr[i][j+1] && arr[i][j] >= arr[i+1][j]) {
						arr[i][j]++;
						cnt++;
					}
				}
			}
		}
		
		System.out.println("물의 총 깊이 : " + cnt);
	}

}
