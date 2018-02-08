package main;

import java.util.HashMap;

public class CompanyDirectoryHashMap implements ICompanyDirectory {
    private HashMap<String, Employee> employees;

    public CompanyDirectoryHashMap() {
        this.employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryHashMap.addEmployee() has not been implemented yet");
    }

    public boolean addOrReplaceEmployee(Employee employee) {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryHashMap.addOrReplaceEmployee() has not been implemented yet");
    }

    public Employee findEmployeeByName(String contactName) {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryHashMap.findEmployeeByName() has not been implemented yet");
    }

    public Employee findEmployeeByOffice(String buildingName, int officeNumber) {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryHashMap.findEmployeeByOffice() has not been implemented yet");
    }

    public void DisplayAllEmployees() {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryHashMap.DisplayAllEmployees() has not been implemented yet");
    }

    public HashMap<String, Employee> getAllEmployees() {
        return this.employees;
    }
}
