package OOP_Encapsulation;

public class TestComp {

	public static void main(String[] args) {

		
		Company c1 = new Company("Infosys", 500, "Pune");
		
		
//		c1.setName("IBM");
//		c1.setSharePrice(1000);
//		c1.setHQ("Bangalore");
//		
		System.out.println(c1.getName());
		System.out.println(c1.getSharePrice());
		System.out.println(c1.getHQ());
		
	}

}
