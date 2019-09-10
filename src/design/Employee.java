package design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//employeeId() will return employee id.
	public int employeeId();
	
	//employeeName() will return employee name
	public String employeeName();
	
	//assignDepartment() will assign employee to departments
    public void assignDepartment();
	
	//calculate employee salary
	public int calculateSalary();
	
	//employee bonus
	public static void joiningBonus(){
		System.out.println("all employ eligible to get joining bonus $3000");

	}

	// employ familyLeave

	public static void familyLeave() {
		System.out.println("only full time employ eligible to get yearly 80 hours family leave");

	}

	// employ yearlyVacation();
	public static void yearlyVacation(){
		System.out.println("all employ allow to get 2 weeks family vacation ");
	}

	//




}
