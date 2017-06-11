package learn.array;

import java.util.Arrays;

/*
 * Two elements in an array whose sum is closest to zero.
 *  
 */
public class sumClosestToZero {

	public static void main(String[] args) {
		int a[] = {1, 4, 7, -4, 9, -1, -7, 2};
		// sort the array
		Arrays.sort(a);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		// traverse the sorted array to find the pair
		minSumClosestToZero(a.length, a);
	}
	
	public static void minSumClosestToZero(int size, int a[]){
		if(size < 2){
			System.out.println("Invalid Input");
		}
		int left = 0;
		int right = size - 1;
		int sum;
		int minSum = 10000;
		int minLeft = 0;
		int minRight = size - 1;
		while(left < right){
			sum = a[left] + a[right];
			if(sum < minSum){
				minSum = sum;
				minLeft = left;
				minRight = right;
			}
			if(sum > 0){
				right--;
			}else{
				left++;
			}
		}
		System.out.println("");
		System.out.println("The two elements with sum closest to zero are : " + a[minLeft] + " and " + a[minRight]);
	}

}
