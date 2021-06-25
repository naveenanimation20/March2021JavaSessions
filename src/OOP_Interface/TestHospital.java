package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.neuroServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.medicalInsurance();
		fh.OPTServices();
		fh.covidTest();
		fh.covidFunds();
		fh.pathologyServices();
		fh.nursingTraining();
		
		USMedical.billing();
		//USMedical.min_fee = 100;
		System.out.println(USMedical.min_fee);
		
		//child class object can be referred by parent interface ref variable:
		//top/up casting:
		USMedical us = new FortisHospital();
		us.emergencyServices();
		us.gynecServices();
		us.neuroServices();
		us.orthoServices();
		us.covidFunds();
		us.covidTest();
		
		UKMedical uk = new FortisHospital();

		//down casting: not allowed
		//FortisHospital fh1 = new USMedical();
		
		
		
	}

}
