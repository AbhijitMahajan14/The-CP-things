
class Employee {

	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;

	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
    public void getSal()
    {
        return salary;
    }
}

class Tester {

	public static void main(String args[]) {

		Employee employee = new Employee();
		employee.employeeId = "C101";
		employee.employeeName = "Steve";
		employee.salary = 650;
		employee.jobLevel = 4;

		employee.calculateSalary();

		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.employeeId);
		System.out.println("Employee Name: " + employee.employeeName);
		System.out.println("Salary: " + employee.salary);

	}
}