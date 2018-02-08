package main;

import java.util.HashMap;

public class CompanyDirectoryHashMap implements ICompanyDirectory {
    private HashMap<String, Employee> employees;

    public CompanyDirectoryHashMap() {
        this.employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        // TODO: implement this
        throw new UnsupportedOperationException();
    }

    public boolean addOrReplaceEmployee(Employee employee) {
        // TODO: implement this
        throw new UnsupportedOperationException();
    }

    public Employee findEmployeeByName(String contactName) {
        // TODO: implement this
        throw new UnsupportedOperationException();
    }

    public Employee findEmployeeByOffice(String buildingName, int officeNumber) {
        // TODO: implement this
        throw new UnsupportedOperationException();
    }

    public void DisplayAllEmployees() {
        // TODO: implement this
        throw new UnsupportedOperationException();
    }

    public HashMap<String, Employee> getAllEmployees() {
        return this.employees;
    }
}
