package ExceptionHandling;

public class TryCatchBlock {
	String name = "Tom";

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0;
			TryCatchBlock obj = new TryCatchBlock();
			//obj = null;
			System.out.println(obj.name);
			
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");

		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmetic exception is coming....");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("NPE exception is coming....");
			e.printStackTrace();
		}
		

		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
