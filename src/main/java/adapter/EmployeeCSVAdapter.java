package adapter;

public class EmployeeCSVAdapter implements Employee {
    private final EmployeeCSV employeeFromCSV;

    public EmployeeCSVAdapter(EmployeeCSV employeeFromCSV) {
        this.employeeFromCSV = employeeFromCSV;
    }

    @Override
    public String getId() {
        return Integer.toString(employeeFromCSV.getId());
    }

    @Override
    public String getFirstName() {
        return employeeFromCSV.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeFromCSV.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeFromCSV.getEmailAddress();
    }

    // For purist: Compared to legacy code `EmployeeCSV` we added this method. This makes it more a decorator pattern
    public String toString() {
        return "ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName() + ", Email: " + getEmail();
    }
}
