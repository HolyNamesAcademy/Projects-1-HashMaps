package main;

import java.util.ArrayList;

public class CompanyDirectoryArrayList implements ICompanyDirectory {
    private ArrayList<Employee> employees;

    public CompanyDirectoryArrayList() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public boolean addOrReplaceEmployee(Employee employee) {
        Employee currentEntry = this.findEmployeeByName(employee.getName());
        if (currentEntry == null) {
            this.addEmployee(employee);
            return false;
        } else {
            // set things
            return true;
        }
    }

    public Employee findEmployeeByName(String contactName) {
        for (Employee employee : this.employees) {
            if (employee.getName().equalsIgnoreCase(contactName)) {
                return employee;
            }
        }

        return null;
    }

    public Employee findEmployeeByOffice(String buildingName, int officeNumber) {
        for (Employee employee : this.employees) {
            if (employee.getBuildingName().equalsIgnoreCase(buildingName) && employee.getOfficeNumber() == officeNumber) {
                return employee;
            }
        }

        return null;
    }

    public ArrayList<Employee> getAllEmployees() {
        return this.employees;
    }
}
