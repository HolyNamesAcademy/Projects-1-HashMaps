package main;

import java.util.ArrayList;

public class CompanyDirectoryArrayList implements ICompanyDirectory {
    private ArrayList<Employee> employees;

    public CompanyDirectoryArrayList() {
        this.employees = new ArrayList<>();
    }

    /**
     * Add a new employee to the directory.
     * @param employee the employee to add to the directory
     */
    public void addEmployee(Employee employee) {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryArrayList.addEmployee() has not been implemented yet");
    }

    /**
     * Find an employee in the directory with a given name.
     * @param employeeName the name of the employee to find
     * @return the employee in the directory with the given name, null if no employee with that name exists
     */
    public Employee findEmployeeByName(String employeeName) {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryArrayList.findEmployeeByName() has not been implemented yet");
    }

    /**
     * Find an employee in the directory based on where they work.
     * @param buildingName the name of the building where the employee works
     * @param officeNumber the office number in the building where the employee works
     * @return the employee in the directory with the given office, null if no employee with that office exists
     */
    public Employee findEmployeeByOffice(String buildingName, int officeNumber) {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryArrayList.findEmployeeByOffice() has not been implemented yet");
    }

    /**
     * Get information about all employees. Each employee's information should be on its own line.
     * @return a String representing information about each employee in the directory.
     */
    public String displayAllEmployees() {
        // TODO: implement this
        throw new UnsupportedOperationException("CompanyDirectoryArrayList.displayAllEmployees() has not been implemented yet");
    }

    public ArrayList<Employee> getAllEmployees() {
        return this.employees;
    }
}
