package main;

import java.util.HashMap;

public class CompanyDirectoryHashMap implements ICompanyDirectory {
    private HashMap<String, Employee> employees;

    public CompanyDirectoryHashMap() {
        this.employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.put(employee.getName(), employee);
    }

    public boolean addOrReplaceEmployee(Employee employee) {
        Employee employeeInDirectory = this.findEmployeeByName(employee.getName());
        this.addEmployee(employee);
        return employeeInDirectory == null;
    }

    public Employee findEmployeeByName(String contactName) {
        for (String employeeName: this.employees.keySet()) {
            Employee employee = this.employees.get(employeeName);
            if (employee.getName().equalsIgnoreCase(contactName)) {
                return employee;
            }
        }

        return null;
    }

    public Employee findEmployeeByOffice(String buildingName, int officeNumber) {
        for (String employeeName: this.employees.keySet()) {
            Employee employee = this.employees.get(employeeName);
            if (employee.getBuildingName().equalsIgnoreCase(buildingName) && employee.getOfficeNumber() == officeNumber) {
                return employee;
            }
        }

        return null;
    }

    public HashMap<String, Employee> getAllEmployees() {
        return this.employees;
    }
}
