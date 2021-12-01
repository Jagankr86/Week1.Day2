package Week1.Day2;

public class CharOccurance {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str1 = "welcome to chennai";
		char charCom1 = 'e';
		int count = 0;
		for (int i = 0; i < str1.length()-1; i++) {
			if(str1.charAt(i) == charCom1) {
				count++;
			}
				else {
					continue;
			}	
		}x
			System.out.println("Char "+charCom1+"occured "+count+" times in the string");
		}	
}
