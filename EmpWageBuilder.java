public class EmpWageBuilder {
	
	public static void main (String args[]) {
		//Constant
		int FULL_TIME = 1;
		
		//Random number generation
		double employeeCheck = Math.floor(Math.random() * 10) % 2;

		//Attendance check
		if(employeeCheck == FULL_TIME) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}

}
