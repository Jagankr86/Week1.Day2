package Week1.Day2;

public class SignConversion {

	public static void main(String[] args) {
		int num = -40;
		int num1 = num;
		if(num<0) {
			num = num * -1;
		}else if(num>0) {
			System.out.println("Number is already postive");
		}
System.out.println("The number " + num1 + " is converted to " + num);
	}

}
