package claimweekoneproject;


import java.util.Calendar;



public abstract class Employee {
	
	static int id = 1;
	String name;
	int empid;
	int start_year;
	int start_month;
	double pay_rate;
	int month_total;
	int year_total;

	public Employee(){
		this.empid = id;
		id += 1;
		
		
		
	}

	public double CalculatePay(){



		return 0;
	}

	public int CalculateTenure(){

		Calendar cal = Calendar.getInstance();
		int today_month = cal.get(Calendar.MONTH) + 1;
		int today_year = cal.get(Calendar.YEAR);
		
		int partial_year = 0;
		
		if(today_month < start_month){
			
			partial_year = 1;
			
		}
		
		int year_total = today_year - start_year - partial_year;
		int month_total = today_month - start_month + (12*partial_year);
		this.month_total = month_total;
		this.year_total= year_total;
		
				
		

		return 0;

	}
	
	public void printTenure(){
		
		System.out.println("Years total: " + year_total + " Month Total: " + month_total);
	}
	
	public static void main(String[] args){
		
		Manager john = new Manager("John", 2000, 4, 40000);
		john.printTenure();
	}

}
