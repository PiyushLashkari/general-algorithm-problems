package learn.array;

/*
 * Maximum sum of continuous sub-array.
 * Kadane's Algorithm
 * 
 */
public class maxSumSubarray {

	public static void main(String[] args) {
		int a[] = {-2, -3, 4, -1, -2, 5, 1, -3};
		System.out.println(maxSumContiguousSubArray(a.length, a));
	}
	
	public static int maxSumContiguousSubArray(int size, int a[]){
		if(size == 0){
			return 0;
		}
		int max = a[0];
		int currentMax = a[0];
		
		for(int i = 1; i < size; i++){
			if(a[i] < (currentMax + a[i])){
				currentMax = currentMax + a[i];
			}else{
				currentMax = a[i];
			}
			
			if(max < currentMax){
				max = currentMax;
			}
		}
		
		return max;
	}

}
