package adapter;

public class EmployeeLdapAdapter implements Employee {

    private final EmployeeLdap employeeFromLdap;

    public EmployeeLdapAdapter(EmployeeLdap employeeFromLdap) {
        this.employeeFromLdap = employeeFromLdap;
    }

    @Override
    public String getId() {
        return employeeFromLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeFromLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeFromLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeFromLdap.getMail();
    }

    // For purist: Compared to legacy code `EmployeeLdap` we added this method. This makes it more a decorator pattern
    public String toString() {
        return "ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName() + ", Email: " + getEmail();
    }
}
