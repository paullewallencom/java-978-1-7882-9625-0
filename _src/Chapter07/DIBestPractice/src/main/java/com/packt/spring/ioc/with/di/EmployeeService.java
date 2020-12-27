package com.packt.spring.ioc.with.di;
public class EmployeeService {
	private AccountService accountService;
	private HRService hrService;
	//constructor
	public EmployeeService(AccountService accountService,HRService hrService) {
		this.accountService = accountService;
		this.hrService = hrService;
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
