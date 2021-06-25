package OOP_Interface;

public class FortisHospital extends HospitalManagement implements USMedical, UKMedical, IndianMedical {

	@Override
	public int orthoServices() {
		System.out.println("FH - orthoServices");
		return 100;
	}

	@Override
	public void neuroServices() {
		System.out.println("FH - neuroServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FH - emergencyServices");

	}

	@Override
	public void gynecServices() {
		System.out.println("FH - gynecServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("FH - ENTServices");

	}

	@Override
	public void PhysioServices() {
		System.out.println("FH - PhysioServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH - oncologyServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("FH - cardioServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH - pediaServices");
	}
	
	//FH - methods
	public void medicalInsurance() {
		System.out.println("FH - medicalInsurance");
	}
	
	public void OPTServices() {
		System.out.println("FH - OPTServices");
	}

	@Override
	public void covidTest() {
		System.out.println("FH - Covid Test");
	}

	@Override
	public void covidFunds() {
		System.out.println("FH - Covid Funds");
	}
	
	@Override
	public void pathologyServices() {
		System.out.println("FH - pathologyServices");
	}
	
	//method hiding
	public static void billing() {
		System.out.println("USM - billing");
	}
	
	@Override
	public void hiring() {
		System.out.println("FH -- hiring");
		System.out.println("FH -- hiring");
		System.out.println("FH -- hiring");
		System.out.println("FH -- hiring");
		System.out.println("FH -- hiring");

	}
	
	
	
	

}
