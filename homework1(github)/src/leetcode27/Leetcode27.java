package leetcode27;

public class Leetcode27 {

	public static void main(String[] args) {
		Leetcode27 l = new Leetcode27();
		int[] numbers = {3, 2, 2, 3};
		int[] numbers2 = {0,1,2,2,3,0,4,2};
		l.removeElement(numbers, 3);
		l.removeElement(numbers2, 2);
	}
	
public int removeElement(int[] nums, int val) {
	int[] newNums = new int[nums.length-1];
	int newNumLength = 0;
	for(int i = 0, k = 0; i<nums.length; i++) {
		if(nums[i] != val) {
			newNums[k] = nums[i];
			System.out.println(newNums[k]);
			newNumLength++;
			k++;
		}
	}

	System.out.println(newNumLength);
	return newNumLength;
        
    }
}
