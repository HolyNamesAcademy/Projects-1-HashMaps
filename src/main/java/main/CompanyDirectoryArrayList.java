package main;

import java.util.ArrayList;

public class CompanyDirectoryArrayList implements ICompanyDirectory {
    private ArrayList<Employee> employees;

    public CompanyDirectoryArrayList() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryArrayList.addEmployee() has not been implemented yet");
    }

    public boolean addOrReplaceEmployee(Employee employee) {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryArrayList.addOrReplaceEmployee() has not been implemented yet");
    }

    public Employee findEmployeeByName(String contactName) {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryArrayList.findEmployeeByName() has not been implemented yet");
    }

    public Employee findEmployeeByOffice(String buildingName, int officeNumber) {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryArrayList.findEmployeeByOffice() has not been implemented yet");
    }

    public void DisplayAllEmployees() {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryArrayList.DisplayAllEmployees() has not been implemented yet");
    }

    public ArrayList<Employee> getAllEmployees() {
        return this.employees;
    }
}
