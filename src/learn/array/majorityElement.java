package learn.array;

/*
 * A majority element in an array of size n is an element that appears
 * more than n/2 times. Hence only one such element is possible.
 * Moore's Voting Algorithm
 */
public class majorityElement {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 1, 1, 4, 1};
		int count = 0;
		int candidate = isMajorityElementCandidate(a.length, a);
		for(int i = 0; i < 7; i++){
			if(a[i] == candidate){
				count++;
			}
		}
		if(count > a.length/2){
			System.out.println("Majority Element is : " + candidate);
		}else{
			System.out.println("No Majority Element");
		}
	}
	
	public static int isMajorityElementCandidate(int size, int a[]){
		int count = 1;
		int majorityElementIndex = 0;
		for(int i = 1; i < size; i++){
			if(a[majorityElementIndex] == a[i]){
				count++;
			}else{
				count--;
			}
			
			if(count == 0){
				count = 1;
				majorityElementIndex = i;
			}
		}
		
		return a[majorityElementIndex];
	}

}
