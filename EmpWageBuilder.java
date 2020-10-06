import java.util.*;

//Interface
interface IemployeeWageComputation {
	public void addCompanyEmpWage(String company,int wage_per_hour,int max_working_days,int max_working_hours );
	public void employeeWageComputation();
	
}

class CompanyEmpWage {
	//Constants
	public final String company;
	public final int wage_per_hour;
	public final int max_working_days;
	public final int max_working_hours;
	public int totalWage;
	
	//Constructor
	public CompanyEmpWage(String company,int wage_per_hour,int max_working_days,int max_working_hours ) {
		this.company = company;
		this.wage_per_hour = wage_per_hour;
		this.max_working_days = max_working_days;
		this.max_working_hours = max_working_days;
	}
	
	public void setTotalEmpWage(int totalWage) {
		this.totalWage = totalWage;
	}
	public String toString() {
		return "Total employee wage for " +company+ " is " +totalWage;
	}
}

public class EmpWageBuilder implements IemployeeWageComputation {
	
		//Constants
		public static final int FULL_TIME = 1;
		public static final int PART_TIME = 2;
		
		private int numOfCompany = 0;
		//ArrayList
		private ArrayList<CompanyEmpWage> companyEmpWageList;
		
		public EmpWageBuilder() {
			companyEmpWageList = new ArrayList<>();
		}
		
		public void addCompanyEmpWage(String company,int wage_per_hour,int max_working_days,int max_working_hours ) {
			CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, wage_per_hour, max_working_days, max_working_hours);
			companyEmpWageList.add(companyEmpWage);
		}
		
		public void employeeWageComputation() {
			for (int i=0; i<companyEmpWageList.size(); i++) {
				CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
				companyEmpWage.setTotalEmpWage(this.employeeWageComputation(companyEmpWage));
				System.out.println(companyEmpWage);
			}
		}
		
		
		public int employeeWageComputation(CompanyEmpWage companyEmpWage) {
				//Variables
				int workHours = 0;
				int dailyWage = 0;
				int totalWorkingHours = 0;
				int totalWorkingDays = 0;
				
				//computation
				while(totalWorkingDays < companyEmpWage.max_working_days && totalWorkingHours < companyEmpWage.max_working_hours) {
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
				dailyWage = workHours * companyEmpWage.wage_per_hour;
				totalWorkingHours += workHours;
				
				System.out.println("Day " +totalWorkingDays+ " employee work hours " +workHours+ " and daily wage is " +dailyWage);
				}
				return totalWorkingHours * companyEmpWage.wage_per_hour;
		}
		
		
		public static void main (String args[]) {
			System.out.println("Welcome to employee wage computation problem");
			
			IemployeeWageComputation empWageBuilder = new EmpWageBuilder();
			empWageBuilder.addCompanyEmpWage("Reliance", 20, 20, 100);
			empWageBuilder.addCompanyEmpWage("Idea", 10, 20, 100);
			empWageBuilder.employeeWageComputation();
		}	
}
