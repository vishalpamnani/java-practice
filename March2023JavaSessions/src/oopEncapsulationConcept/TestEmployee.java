package oopEncapsulationConcept;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name = "Sneha";
		e1.age = 30;
		
		e1.setSalary(35.95);
		System.out.println(e1.getSalary()+" "+e1.name+" "+e1.age);
		
		
		
		Company c1 = new Company();
		c1.setName("Google");
		c1.setSharePrice(9000);
		c1.setEmpCount(5000);
		
		System.out.println(c1.getName()+" "+c1.getSharePrice()+" "+c1.getEmpCount());
		
		
		//Registration
		RegistrationPage rp = new RegistrationPage("Ishika", 27, "Pune", "01-03-1996");
		
		System.out.println(rp.getName());
		System.out.println(rp.getAge());
		System.out.println(rp.getAddress());
		
		rp.setAddress("Bangalore");
		
		System.out.println(rp.getName());
		System.out.println(rp.getAddress());
		
		
		//Browser
		Browser br = new Browser();
		br.launchBrowser();

	}

}
