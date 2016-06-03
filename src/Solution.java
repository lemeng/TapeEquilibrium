
public class Solution {

	public static void main(String[] args) {
		
		//int[] input = {3,1,2,4,3};
		int[] input = {1,-1,0,1};
		
		int result = 0;
		
		result = solution(input);
		
		System.out.println(result);
	}
	
	public static int solution(int[] A) {
		
		//This array contains all the differences between each index of input array
		int[] cuttingPoints = new int[A.length-1];
		
		//this array holds the sum of all elements on the left of a given index (including the given one)
		int[] leftSum = new int[A.length];
		
		int sum = 0;
		
		for (int i=0; i<A.length; i++) {
			sum += A[i];
			leftSum[i] = sum;
			}
		
		for (int j=0; j<cuttingPoints.length;j++) {
			cuttingPoints[j] = Math.abs(leftSum[leftSum.length-1] - 
							leftSum[j] - leftSum[j]);
		}
		
		//find out the smallest value within the array containing all the differences
		int minimum = cuttingPoints[0];
						
		for (int z=0; z<cuttingPoints.length;z++) {
					
			if (cuttingPoints[z] < minimum) {
						minimum = cuttingPoints[z];
							} 
		}
				
		return minimum;				
	}
	
}
