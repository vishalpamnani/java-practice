package oopInterface;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical {
	
	int min_fee = 50;

	// US
	@Override
	public void cardioServices() {
		System.out.println("FH -- cardio");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuro");
	}

	@Override
	public void physioServices() {
		System.out.println("FH -- physio");
	}

	// UK
	@Override
	public void entServices() {
		System.out.println("FH -- ent");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dental");
	}

	// India
	@Override
	public void oncologyServices() {
		System.out.println("FH -- onco");
	}

	@Override
	public void gynacServices() {
		System.out.println("FH -- gyno");
	}

	@Override
	public void orthoServices() {
		System.out.println("FH -- ortho");
	}

	// Common
	@Override
	public void emergencyServices() {
		System.out.println("FH -- Common Emergence Service");

	}

	// Individual
	public void medicalTraining() {
		System.out.println("FH -- medical training");
	}

	public void medicalInsurance() {
		System.out.println("FH -- mediclaim");
	}

	// Parent Interface Methods
	@Override
	public void covidVaccination() {
		System.out.println("World Medical Council Covid Vaccination provided to FH");

	}

	@Override
	public void pandemicGuidelines() {
		System.out.println("FH is following the pandemic guidelines given by World Medical Council");

	}
	
	//USHB
	@Override
	public void childCareServices() {
		System.out.println("FH -- Child Care Services");

	}
	
	//method hiding
	public static void taxCalculation() {
		System.out.println("FH -- internal tax calculation");
	}

//	//parent class method
//	@Override
//	public void medicalNews() {
//		System.out.println("FH -- Medical News");
//	}
	
	
	//override default interface method
	@Override
	public void getMedicalServices() {
		System.out.println("FH -- Medical Services");
	}

}
