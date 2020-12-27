package com.packt.spring.ioc.without.di;

public class EmployeeService {
	private AccountService accountService;
	private HRService hrService;
	//constructor
	public EmployeeService() {
		if(ServiceManager.getDependentService("accountService") !=null) {
			accountService = (AccountService) ServiceManager.getDependentService("accountService");
		}
		if(ServiceManager.getDependentService("hrService") !=null) {
			hrService = (HRService) ServiceManager.getDependentService("hrService");
		}
	}
	public void generateRewardPoints() {
		if(hrService !=null && accountService !=null) {
			int noOfLeaves = this.hrService.getLeaveInGivenMonth(8);
			System.out.println("No of Leaves are : "+noOfLeaves);
			this.accountService.getVariablePay();
			//Some complex logic to generate rewards points based on variable pay and total leave 
			//taken in given month.
		}
	}
}
