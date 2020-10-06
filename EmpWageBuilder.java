public class EmpWageBuilder {

		//Constants
		public static final int FULL_TIME = 1;
		public static final int PART_TIME = 2;
		
		private final String company;
		private final int wage_per_hour;
		private final int max_working_days;
		private final int max_working_hours;
		private int totalWage;
		
		//Constructor
		public EmpWageBuilder(String company,int wage_per_hour,int max_working_days,int max_working_hours ) {
			this.company = company;
			this.wage_per_hour = wage_per_hour;
			this.max_working_days = max_working_days;
			this.max_working_hours = max_working_hours;
		}
		
		//Class method
		public void employeeWageComputation() {
			System.out.println(company);
			//Variables
			int workHours = 0;
			int dailyWage = 0;
			int totalWorkingHours = 0;
			int totalWorkingDays = 0;
				
			while(totalWorkingDays < max_working_days && totalWorkingHours < max_working_hours) {
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
			int totalWage = totalWorkingHours * wage_per_hour;
		}
		
		public String toString() {
			return "Total employee wage for " +company+ " is " +totalWage;
		}
		
		public static void main (String args[]) {
			System.out.println("Welcome to employee wage computation problem");
			
			EmpWageBuilder company1 = new EmpWageBuilder("Reliance", 20, 20, 100);
			company1.employeeWageComputation();
			
			EmpWageBuilder company2 = new EmpWageBuilder("Idea", 10, 30, 100);
			company2.employeeWageComputation();
		}	
}
