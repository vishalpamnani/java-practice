package oopInterface;

public class HospitalTest {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.physioServices();
		fh.entServices();
		fh.neuroServices();
		fh.oncologyServices();
		
		fh.emergencyServices();
		
		fh.medicalInsurance();
		fh.medicalTraining();
		
		fh.medicalRD();
		fh.medicalNews();
		
		fh.pandemicGuidelines();
		fh.covidVaccination();
		
		fh.childCareServices();
		
		System.out.println(fh.min_fee);
		System.out.println(USMedical.min_fee);
		
		FortisHospital.taxCalculation();
		USMedical.taxCalculation();
		
		fh.getMedicalServices();

		
		//top casting
		//child class object can be referred by parent Interface ref variable
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();
		
		UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.entServices();
		uk.emergencyServices();
		
		IndianMedical in = new FortisHospital();
		in.gynacServices();
		in.oncologyServices();
		in.orthoServices();
		in.emergencyServices();
		
		//use constants
		System.out.println(Constants.OK_MESSAGE_200);
		System.out.println(Constants.DEFAULT_TIME_OUT);
		


	}

}
