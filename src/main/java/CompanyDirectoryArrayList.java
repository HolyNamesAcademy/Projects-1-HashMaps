import java.util.ArrayList;

public class CompanyDirectoryArrayList implements ICompanyDirectory {
    private ArrayList<Employee> employees;

    public void addContact(Employee employee) {
        // TODO: don't add if already exists or replace?
        this.employees.add(employee);
    }

    public Employee findContact(String contactName) {
        for (Employee employee : this.employees) {
            if (employee.getName().equalsIgnoreCase(contactName)) {
                return employee;
            }
        }

        return null;
    }

    public Employee findContactWithOffice(String buildingName, int officeNumber) {
        for (Employee employee : this.employees) {
            if (employee.getBuildingName().equalsIgnoreCase(buildingName) && employee.getOfficeNumber() == officeNumber) {
                return employee;
            }
        }

        return null;
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }
}
