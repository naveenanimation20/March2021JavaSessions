package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 3;
			// System.exit(1);
		} catch (Exception e) {
			System.out.println("AE is coming....");
		}

		finally {
			System.out.println("I am in finally block....");
		}

		//System.out.println(getMarks("Tom"));
			DBConnection();
	}

	public static void DBConnection() {
		System.out.println("connecting with DB");
		System.out.println("connected with DB");
		
		System.out.println("send the SQL ");
		
		System.out.println("get the data from DB");
		try {
			int i = 9/3;
			System.out.println("data not found exception");
		}
		catch(Exception e) {
			System.out.println("some exception is coming...");	
		}
		
		finally {
			System.out.println("close the DB connection");
		}
		
	}
	
	
	
	
	public static int getMarks(String name) {
		if (name.equals("Tom")) {
			try {
				int m = 9 / 0;
				return 90;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming...");
				//System.exit(1);
				return 80;
			}
			finally {
				return 100;
			}
		} else if (name.equals("Peter")) {
			return 90;
		}

		return -1;

	}

}
