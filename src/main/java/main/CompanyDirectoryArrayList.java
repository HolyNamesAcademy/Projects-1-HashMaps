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
        this.employees.add(employee);
    }

    /**
     * Find an employee in the directory with a given name.
     * @param employeeName the name of the employee to find
     * @return the employee in the directory with the given name, null if no employee with that name exists
     */
    public Employee findEmployeeByName(String employeeName) {
        for (int i = 0; i < this.employees.size(); i++) {
            Employee currentEmployee = this.employees.get(i);
            if (currentEmployee.getName().equals(employeeName)) {
                return currentEmployee;
            }
        }

        return null;
    }

    /**
     * Find an employee in the directory based on where they work.
     * @param buildingName the name of the building where the employee works
     * @param officeNumber the office number in the building where the employee works
     * @return the employee in the directory with the given office, null if no employee with that office exists
     */
    public Employee findEmployeeByOffice(String buildingName, int officeNumber) {
        for (int i = 0; i < this.employees.size(); i++) {
            Employee currentEmployee = this.employees.get(i);
            if (currentEmployee.getBuildingName().equals(buildingName) && currentEmployee.getOfficeNumber() == officeNumber) {
                return currentEmployee;
            }
        }

        return null;
    }

    /**
     * Get information about all employees. Each employee's information should be on its own line.
     * @return a String representing information about each employee in the directory.
     */
    public String displayAllEmployees() {
        String result = "";
        for (int i = 0; i < this.employees.size(); i++) {
            result += this.employees.get(i).toString() + System.lineSeparator();
        }

        return result;
    }

    /**
     * (EXTRA CREDIT) Updates an employee's office location.
     * @param employeeName The name of the employee to update.
     * @param buildingName The new building name where the employee works.
     * @param officeNumber The new office number in the building where the employee works.
     * @return True if the employee exists and their information was updated;
     *         False if the employee is already at the building and office specified, or if no employee with that name exists
     */
    public boolean updateEmployeeOffice(String employeeName, String buildingName, int officeNumber) {
        return false;
    }

    public ArrayList<Employee> getAllEmployees() {
        return this.employees;
    }
}
