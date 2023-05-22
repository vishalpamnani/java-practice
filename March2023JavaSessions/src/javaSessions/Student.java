package javaSessions;

public class Student {
	
	
	//WAF:
	//give the student name(String) as parameter and return student marks(int)
	public int getStudentMarks(String studentName) {
		System.out.println("These are marks for : "+studentName);
		
		if(studentName.equals("Carlos")) {
			return 100;
		}
		
		else if(studentName.equals("Himani")) {
			return 90;
		}
		
		else if(studentName.equals("Sanket")) {
			return 80;
		}
		
		else {
			System.out.println("Student name not found in the database....");
			return -1;
		}
	}
	
	
	//WAF:
	//launch the browser: FF/CH/SF/IE
	//Create a function and pass browser name(String)
	//return boolean
	public boolean launchBrowser(String browserName) {
		
		System.out.println("launching browser: "+browserName);
		boolean flag = false;
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome is launched!");		
			flag = true;
			break;
			
		case "firefox":
			System.out.println("Firefox is launched!");	
			flag = true;
			break;
			
		case "safari":
			System.out.println("Safari is launched!");
			flag = true;
			break;
			
		case "edge":
			System.out.println("IE is launched!");
			flag = true;
			break;	

		default:
			System.out.println("Browser not found!");
			break;
		}
		
		return flag;
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		Student stu = new Student();
		int studentMarks = stu.getStudentMarks("Neha");
		System.out.println(studentMarks);
		if(studentMarks==-1) {
			System.out.println("no need to print this marksheet.");
		}
		
		if(stu.launchBrowser("Chrome")) {
			System.out.println("Launch the url...");
		}
		else {
			System.out.println("No need to launch the url...");
		}

		
	}

}
