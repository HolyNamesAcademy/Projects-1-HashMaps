package main;

/**
 * A directory of employees at a company.
 */
public interface ICompanyDirectory {

    /**
     * Add a new employee to the directory.
     * @param employee the employee to add to the directory
     */
    void addEmployee(Employee employee);

    /**
     * Find an employee in the directory with a given name.
     * @param employeeName the name of the employee to find
     * @return the employee in the directory with the given name, null if no employee with that name exists
     */
    Employee findEmployeeByName(String employeeName);

    /**
     * Find an employee in the directory based on where they work.
     * @param buildingName the name of the building where the employee works
     * @param officeNumber the office number in the building where the employee works
     * @return the employee in the directory with the given office, null if no employee with that office exists
     */
    Employee findEmployeeByOffice(String buildingName, int officeNumber);

    /**
     * Get information about all employees. Each employee's information should be on its own line.
     * @return a String representing information about each employee in the directory.
     */
    String displayAllEmployees();

    /**
     * (EXTRA CREDIT) Updates an employee's office location.
     * @param employeeName The name of the employee to update.
     * @param buildingName The new building name where the employee works.
     * @param officeNumber The new office number in the building where the employee works.
     * @return True if the employee exists and their information was updated;
     *         False if the employee is already at the building and office specified, or if no employee with that name exists
     */
    boolean updateEmployeeOffice(String employeeName, String buildingName, int officeNumber);
}
