package leetcode344;


public class Leetcode344 {
	public static void main(String[] args) {
		Leetcode344 l = new Leetcode344();
		char[] arr1 = {'H', 'a', 'n', 'n', 'a', 'h'};
		char[] arr2 = {'j', 'i', 'm', 'b', 'o'};
		l.reverseString(arr2);
		l.reverseString(arr1);
	}
	
	public void reverseString(char[] s) {
		int j = 0;
		int i = s.length-1;
		
		while(j<i) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			j++;
			i--;
		}

		System.out.println(s);
	}
}
