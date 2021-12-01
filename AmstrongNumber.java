package Week1.Day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		int input = 157;
		int oriNumber = input;
		int sum = 0;
		int rem = 0;
while(input!=0) {
	rem = input % 10;
	//rem = rem * rem * rem;
	sum = sum + (rem*rem*rem);
	input = input / 10;
}

if (sum == oriNumber) {
	System.out.println("Given input is Amstrong number");
}
	else {
		System.out.println("given number is not an amstrong number");
	}

	}

}
