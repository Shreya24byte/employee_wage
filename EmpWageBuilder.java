public class EmpWageBuilder {
	

	public static void main (String args[]) {
		System.out.println("Welcome to employee wage computation problem");
		//Constants
		final int FULL_TIME = 1;
		final int PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		
		//Variables
		int workHours = 0;
		
		int employeeCheck = (int) (Math.floor(Math.random()*10)%3);
		
		//Attendance check
		switch(employeeCheck) {
		case FULL_TIME:
			workHours = 8;
			System.out.println("Employee is present full time");
			break;
		case PART_TIME:
			workHours = 4;
			System.out.println("Employee is present part time");
			break;
		default:
			workHours = 0;
			System.out.println("Employee is absent");
			break;
		}
		System.out.println("Employee daily wage is " +workHours * WAGE_PER_HOUR);
	
	}
}
