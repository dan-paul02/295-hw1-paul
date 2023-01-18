package leetcode9;

public class Leetcode9 {
	
	public static void main(String[] args) {
		Leetcode9 l = new Leetcode9();
		//Tests 1, 2, and 4 should return true
		//Tests 3, 5, 6, and 7 should return false
		l.isPalindrome(505);
		l.isPalindrome(0);
		l.isPalindrome(10);
		l.isPalindrome(404);
		l.isPalindrome(105);
		l.isPalindrome(45);
		l.isPalindrome(-404);
	}
	
	
	public boolean isPalindrome(int input) {
		int reverseNumber = 0;
		int tempNumber = input;
		while(tempNumber > 0) {
			int part = tempNumber % 10;
			reverseNumber = reverseNumber * 10 + part;
			tempNumber/=10;
			
		}
		
		if(input == reverseNumber) {
			System.out.println("palindrome");
			return true;
		}
		else {
			System.out.println("not palindrome");
			return false;
		}
	}
}
