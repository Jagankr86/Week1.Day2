package Week1.Day2;

public class Calculator {
	
	public int add(int num1, int num2) {
		return num1+num2;

	}
	public int sub(int num1, int num2) {
		return num1-num2;

	}
	public int mul(int num1, int num2) {
		return num1*num2;

	}
	public int div(int num1, int num2) {
		return num1/num2;

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.add(30,20);
		System.out.println("Subtreaction =" + calc.sub(30,20));
		System.out.println("Addition = " + result);
		System.out.println("Division =" + calc.div(30,20));
		System.out.println("Multiplication =" + calc.mul(30,20));

	}

}
