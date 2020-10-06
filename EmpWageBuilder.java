public class EmpWageBuilder {

		//Constants
		public static final int FULL_TIME = 1;
		public static final int PART_TIME = 2;
		
		//Class method
		void employeeWageComputation(String company, int wage_per_hour, int max_working_days, int max_working_hours) {
				System.out.println(company+ " company employee wage computation");
		//Variables
		int workHours = 0;
		int dailyWage = 0;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;
				

		  while(totalWorkingDays <= max_working_days && totalWorkingHours < max_working_hours) {
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
		dailyWage = workHours * wage_per_hour;
		totalWorkingHours += workHours;
				
		System.out.println("Day " +totalWorkingDays+ " employee work hours " +workHours+ " and daily wage is " +dailyWage);
		}
		System.out.println("Employee monthly wage is " +totalWorkingHours * wage_per_hour);
		System.out.println("----------------------------------------------------------");
	}
		public static void main (String args[]) {
			System.out.println("Welcome to employee wage computation problem");
			
			EmpWageBuilder company1 = new EmpWageBuilder();
			company1.employeeWageComputation("Reliance", 20, 20, 100);
			
			EmpWageBuilder company2 = new EmpWageBuilder();
			company2.employeeWageComputation("Idea", 10, 30, 100);
		}
}
