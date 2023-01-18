package leetcode13;

public class Leetcode13 {
	public static void main(String[] args) {
		Leetcode13 l = new Leetcode13();
		l.romantoInt("III");
		l.romantoInt("IV");
		l.romantoInt("V");
		l.romantoInt("EVII");
		l.romantoInt("LVIII");
		l.romantoInt("CDII");
		l.romantoInt("DVIII");
		l.romantoInt("MCMXCIV");
	}
	
	public int romantoInt(String s) {
		String[] arr = s.split("");
		int romantoIntSum = 0;
		String previousChar = "";
		boolean invalidChar = false;
		for(int i = 0; i<s.length(); i++) {
			if(invalidChar == false) {
			switch(arr[i]) {
			case "I":	
					romantoIntSum++;
					previousChar = "I";
				break;
			case "V":
				if(previousChar.equals("I")) {
					romantoIntSum+=3;
				}
				else {
					romantoIntSum += 5;
				}
				//System.out.println(romantoIntSum);
				previousChar = "V";
				break;
			case "X":
				if(previousChar.equals("I")) {
					romantoIntSum+=8;
				}
				else {
					romantoIntSum += 10;
				}
				previousChar = "X";
				break;
			case "L":
				if(previousChar.equals("X")) {
					romantoIntSum+=30;
				}
				else {
					romantoIntSum += 50;
				}
				previousChar = "L";
				break;
			case "C":
				if(previousChar.equals("X")) {
					romantoIntSum+=80;
				}
				else {
					romantoIntSum += 100;
				}
				previousChar = "C";
				break;
			case "D":
				if(previousChar.equals("C")) {
					romantoIntSum+=300;
				}
				else {
					romantoIntSum += 500;
				}
				previousChar = "D";
				break;
			case "M":
				if(previousChar.equals("C")) {
					//romantoIntSum -= 100;
					romantoIntSum+=800;
				}
				else {
					romantoIntSum += 1000;
				}
				previousChar = "M";
				break;
			default:
				System.out.println("Invalid character");
				invalidChar = true;
				break;
			}
			}
			else {
				return 0;
			}
			System.out.println(arr[i]);
		}
		
		System.out.println(romantoIntSum);
		return romantoIntSum;
		
	}
}
