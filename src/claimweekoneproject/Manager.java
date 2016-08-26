package claimweekoneproject;

public class Manager extends Employee {
	
	public Manager(String name, int start_year, int start_month, double pay_rate){
		
		
		this.name = name;
		this.start_year = start_year;
		this.start_month = start_month;
		this.pay_rate = pay_rate;
		
		CalculateTenure();
		
	}

}
