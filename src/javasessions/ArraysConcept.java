package javasessions;

public class ArraysConcept {

	public static void main(String[] args) {

		//size is fixed and can store only similar type of data
		//non primitive data types
		
		//arrays literals:
		int num[] = {1,2,3,4,5,6,220,23,30};
		System.out.println(num.length);
		
		for(int e : num) {
			System.out.println(e);
		}
		
		//int array:
		int i[] = new int[40];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println("li =" + 0);
		int len = i.length;
		System.out.println("length =" + len);
		System.out.println("hi =" + (len-1));

		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException

		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		//to print all the values from array: use for loop
		for(int k = 0; k<i.length; k++) {
			System.out.println(i[k]);//10 20 30 40 
		}
		
		//for each:
		for(int e : i) {
			System.out.println(e);
		}
		
		//2. double array:
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 23.44;
		System.out.println(d[0]+d[1]);
		
		//3. char array:
		char c[] = new char[3];
		c[0]='a';
		
		//4. String array:
		String name[] = new String[4];
		name[0] = "tom";
		name[1] = "peter";
		name[2] = "naveen";
		name[3] = "lisa";

		for(String e : name) {
			System.out.println(e);
			
				if(e.equals("naveen")) {
					System.out.println("he is the trainer...");
				}
		}
		
		String product[] = new String[100];
		
		//you have to store emp data: string, int, double, char, string
		//to solve this issuem we can use Object Array (static):
		
		Object ob[] = new Object[5];
		ob[0] = "Tom";
		ob[1] = 30;
		ob[2] = 34.55;
		ob[3] = 'm';
		ob[4] = "London";
		
		for(int p=0; p<ob.length; p++) {
			System.out.println(ob[p]);
		}
		
		for(Object e : ob) {
			System.out.println(e);
		}
		
		Object emp[] = {"Tom", 30, 23.44};
		System.out.println(emp.length);
		
		
		byte a = 100;
		a = 101;
		byte b = 127;
		byte c1 = (byte) (a + b);

		System.out.println(c1); // -37 -->  How? please explain?
		System.out.println(a + b); // 228 
		

		
	}

}
