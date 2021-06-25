package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		String data = null;
		if (data == null) {
			try {
				throw new Exception("DATANOTFOUNDEXCEPTION");
			} catch (Exception e) {
				System.out.println("some exception is coming....");
				e.printStackTrace();
			}
		}

	}

}
