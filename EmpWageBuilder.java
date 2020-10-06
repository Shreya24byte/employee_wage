public class EmpWageBuilder {
	

	public static void main (String args[]) {
		System.out.println("Welcome to employee wage computation problem");

		//Constants
		int FULL_TIME = 1;
		int PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		int FULL_TIME_HOUR = 8;

		//Variables
		int workHours = 0;

		double employeeCheck = Math.floor(Math.random()*10)%3;

		//Attendance check
		if(employeeCheck == FULL_TIME) {
			workHours = 8;
			System.out.println("Employee is present full time");
		}
		else if(employeeCheck == PART_TIME) {
			workHours = 4;
			System.out.println("Employee is present part time");
		}
		else {
			workHours = 0;
			System.out.println("Employee is absent");
		}
		System.out.println("Employee daily wage is " +workHours * WAGE_PER_HOUR);
	}
}
