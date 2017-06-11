package learn.matrix;

public class printMatrixSpiral {

	public static void main(String[] args) {
		int [][] arr = new int[3][6]; 
		int num = 1;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 6; j++){
				arr[i][j] = num;
				num++;
			}
		}
		System.out.println("Original Array : ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 6; j++){
				System.out.print(arr[i][j]); 
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("Printing Array Elements in Spiral Form : ");
		printMatrixInSpiralForm(3, 6, arr);

	}

	public static void printMatrixInSpiralForm(int m, int n, int arr[][]){
		int i;
		int k = 0; // start of rows
		int l = 0; // start of columns
		
		while(k < m && l < n){
			// printing the first row
			for(i = l; i < n; i++){
				System.out.println(arr[k][i]);
			}
			k++;
			
			// printing the last column
			for(i = k; i < m; i++){
				System.out.println(arr[i][n-1]);
			}
			n--;
			
			// printing the last row
			if(k < m){
				for(i = n-1; i >= l; i--){
					System.out.println(arr[m-1][i]);
				}
				m--;
			}
			
			// printing first column
			if(l < n){
				for(i = m-1; i >= k; i--){
					System.out.println(arr[i][l]);
				}
				l++;
			}
		}
	}
}
