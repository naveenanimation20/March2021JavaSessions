package javasessions;

public class LongNumbers {

	/**
	 * What will be the output when you use a Long number with L and without L suffix?
	 * 
	 */
	
	public static void main(String arg[]) {
		
		long longNumberWithoutL = 1000*60*60*24*365;
		long longNumberWithL = 1000*60*60*24*365L;

		System.out.println(longNumberWithoutL);//1471228928
		System.out.println(longNumberWithL);//31536000000

		//31536000000 -- 36 bits
		// 11101010111101100010010110000000000
		//max limit of 32 bit int: 2147483647
		//1010111101100010010110000000000 --> 1471228928
	}
	
	

}







