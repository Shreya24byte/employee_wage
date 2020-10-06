public class EmpWageBuilder {
	

	public static void main (String args[]) {
		System.out.println("Welcome to employee wage computation problem");
		//Constants
		final int FULL_TIME = 1;
		final int PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int MAX_WORKING_DAYS = 20;
		final int MAX_WORKING_HOURS = 100;
				
		//Variables
		int workHours = 0;
		int dailyWage = 0;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;
				
		while(totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
			totalWorkingDays++;
					
			int employeeCheck = (int) (Math.floor(Math.random()*10)%3);
					
			//Attendance check
			switch(employeeCheck) {
			case FULL_TIME:
				workHours = 8;
				break;
			case PART_TIME:
				workHours = 4;
				break;
			default:
				workHours = 0;
				break;
			}
			
		//daily wage calculations
		dailyWage = workHours * WAGE_PER_HOUR;
		totalWorkingHours += workHours;
				
		System.out.println("Day " +totalWorkingDays+ " employee work hours " +workHours+ " and daily wage is " +dailyWage);
		}
		System.out.println("Employee monthly wage is " +totalWorkingHours * WAGE_PER_HOUR);
	}
}
