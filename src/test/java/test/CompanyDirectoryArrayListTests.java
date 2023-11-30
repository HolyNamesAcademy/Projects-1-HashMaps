package test;

import main.CompanyDirectoryArrayList;
import main.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyDirectoryArrayListTests {

    // Test that you can successfully add a new employee to the directory.
    @Test
    public void canAddEmployeeToDirectory() throws Exception {
        String expectedEmployeeName = "Paul McCartney";
        Employee expectedEmployee = new Employee(expectedEmployeeName, "Abbey Road", 1969);
        CompanyDirectoryArrayList directory = new CompanyDirectoryArrayList();
        directory.addEmployee(expectedEmployee);

        Employee actualEmployee = directory.getAllEmployees().get(0);
        assertEquals(expectedEmployee, actualEmployee);
    }

    // Add a new employee to the directory and find that employee by their name.
    @Test
    public void findEmployeeThatExistsByName() throws Exception {
        CompanyDirectoryArrayList directory = new CompanyDirectoryArrayList();
        String expectedEmployeeName = "Paul McCartney";
        Employee expectedEmployee = new Employee(expectedEmployeeName, "Abbey Road", 1969);
        directory.addEmployee(expectedEmployee);

        Employee actualEmployee = directory.findEmployeeByName(expectedEmployeeName);
        assertEquals(expectedEmployee, actualEmployee);
    }

    // Add a new employee to the directory and find that employee by their office.
    @Test
    public void findEmployeeByOffice() throws Exception {
        CompanyDirectoryArrayList directory = new CompanyDirectoryArrayList();

        String expectedBuildingName = "Red House";
        int expectedOfficeNumber = 1967;

        directory.addEmployee(new Employee("Other Name 1", "Other Building Name 1", expectedOfficeNumber));
        directory.addEmployee(new Employee("Other Name 2", expectedBuildingName, 2000));

        Employee expectedEmployee = new Employee("Jimi Hendrix", expectedBuildingName, expectedOfficeNumber);
        directory.addEmployee(expectedEmployee);

        directory.addEmployee(new Employee("Other Name 3", "Other Building Name 2", expectedOfficeNumber));
        directory.addEmployee(new Employee("Other Name 4", expectedBuildingName, 2001));

        Employee actualEmployee = directory.findEmployeeByOffice(expectedBuildingName, expectedOfficeNumber);
        assertEquals(expectedEmployee, actualEmployee);
    }

    // Find an employee that is not in the directory by their name.
    @Test
    public void findEmployeeThatDoesNotExistByName() throws Exception {
        // TODO: implement this
        throw new UnsupportedOperationException("Test not yet implemented.");
    }
    
    // EXTRA CREDIT: Check that you can correctly update the office location for an employee in the directory.
    @Test
    public void updateOfficeForEmployeeThatExists() throws Exception {
        // TODO: implement this if you are completing the corresponding extra credit
    }
}
