package main;

import java.util.ArrayList;

public class CompanyDirectoryArrayList implements ICompanyDirectory {
    private ArrayList<Employee> employees;

    public CompanyDirectoryArrayList() {
        this.employees = new ArrayList<>();
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

    public ArrayList<Employee> getAllEmployees() {
        return this.employees;
    }
}
