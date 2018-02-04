package main;

import main.Employee;

import java.util.HashMap;

public class CompanyDirectoryHashMap implements ICompanyDirectory {
    private HashMap<String, Employee> employees;

    public CompanyDirectoryHashMap() {
        this.employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        // TODO: don't add if already exists or replace?
        this.employees.put(employee.getName(), employee);
    }

    public Employee findEmployee(String contactName) {
        for (String employeeName: this.employees.keySet()) {
            Employee employee = this.employees.get(employeeName);
            if (employee.getName().equalsIgnoreCase(contactName)) {
                return employee;
            }
        }

        return null;
    }

    public Employee findEmployeeWithOffice(String buildingName, int officeNumber) {
        for (String employeeName: this.employees.keySet()) {
            Employee employee = this.employees.get(employeeName);
            if (employee.getBuildingName().equalsIgnoreCase(buildingName) && employee.getOfficeNumber() == officeNumber) {
                return employee;
            }
        }

        return null;
    }

    public HashMap<String, Employee> getEmployees() {
        return this.employees;
    }
}
