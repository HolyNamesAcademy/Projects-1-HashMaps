package test;

import main.CompanyDirectoryHashMap;
import main.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyDirectoryHashMapTests {

    // Test that you can successfully add a new employee to the directory.
    @Test
    public void addEmployee() throws Exception {
        CompanyDirectoryHashMap directory = new CompanyDirectoryHashMap();
        String expectedEmployeeName = "Paul McCartney";
        Employee expectedEmployee = new Employee(expectedEmployeeName, "Abbey Road", 1969);
        directory.addEmployee(expectedEmployee);

        Employee actualEmployee = directory.getAllEmployees().get(expectedEmployeeName);
        assertEquals(expectedEmployee, actualEmployee);
    }

    // Add a new employee to the directory and find that employee by their name.
    @Test
    public void findEmployeeThatExistsByName() throws Exception {
        // TODO: implement this
        throw new UnsupportedOperationException();
    }

    // Find an employee that is not in the directory by their name.
    @Test
    public void findEmployeeThatDoesNotExistByName() throws Exception {
        // TODO: implement this
        throw new UnsupportedOperationException();
    }

    // Add a new employee to the directory and find that employee by their office.
    @Test
    public void findEmployeeByOffice() throws Exception {
        // TODO: implement this
        throw new UnsupportedOperationException();
    }
}