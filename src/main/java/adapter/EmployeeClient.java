package adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();

		// EmployeeDB does not need to be adapted because it already conforms to Interface `Employee`
//		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
//		employees.add(employeeFromDB);

		// EmployeeLdap is legacy and does not conform to interface `Employee`.
		// Hence it needs to be adapted
//		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
//		employees.add(new EmployeeLdapAdapter(employeeFromLdap));

		// EmployeeCSV is legacy and does not conform to interface `Employee`.
		// Hence it needs to be adapted
		EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
		employees.add(new EmployeeCSVAdapter(employeeFromCSV));

		return employees;
		
	}
	
}
