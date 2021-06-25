package javasessions;

public class PrintNum {

	public static void main(String[] args) {

		// 1 to 100:
		// recursive function: a funciton is calling itself

		printNumber(1);
		
		//fact(5) = 5x4x3x2x1 = 120
		//fact(1) = 1
		//fact(0)= 1

	}

	public static void printNumber(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNumber(num);
		}

	}

}
