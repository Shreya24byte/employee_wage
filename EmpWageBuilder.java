public class EmpWageBuilder {
	
	public static void main (String args[]) {
		//Constant
		int FULL_TIME = 1;
		int WAGE_PER_HOUR = 20;
		int FULL_TIME_HOUR = 8;
		
		//Random number generation
		double employeeCheck = Math.floor(Math.random() * 10) % 2;

		//Attendance check
		if(employeeCheck == FULL_TIME) {
			System.out.println("Employee is present");
			System.out.println("Employee daily wage is " +FULL_TIME_HOUR * WAGE_PER_HOUR);
		}
		else {
			System.out.println("Employee is absent");
		}
	}

}
