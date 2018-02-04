package test;

import main.CompanyDirectoryHashMap;
import main.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyDirectoryHashMapTests {

    @Test
    public void addContact() {
        CompanyDirectoryHashMap directory = new CompanyDirectoryHashMap();
        String expectedEmployeeName = "Paul McCartney";
        Employee expectedEmployee = new Employee(expectedEmployeeName, "Abbey Road", 1969);
        directory.addEmployee(expectedEmployee);

        Employee actualEmployee = directory.getAllEmployees().get(expectedEmployeeName);
        assertEquals(expectedEmployee, actualEmployee);
    }

    @Test
    public void findEmployeeByName() {
        CompanyDirectoryHashMap directory = new CompanyDirectoryHashMap();
        String expectedEmployeeName = "Paul McCartney";
        Employee expectedEmployee = new Employee(expectedEmployeeName, "Abbey Road", 1969);
        directory.addEmployee(expectedEmployee);

        Employee actualEmployee = directory.findEmployeeByName(expectedEmployeeName);
        assertEquals(expectedEmployee, actualEmployee);
    }

    @Test
    public void findEmployeeByOffice() {
        CompanyDirectoryHashMap directory = new CompanyDirectoryHashMap();
        String expectedBuildingName = "Red House";
        int expectedOfficeNumber = 1967;
        Employee expectedEmployee = new Employee("Jimi Hendrix", expectedBuildingName, expectedOfficeNumber);
        directory.addEmployee(expectedEmployee);

        Employee actualEmployee = directory.findEmployeeByOffice(expectedBuildingName, expectedOfficeNumber);
        assertEquals(expectedEmployee, actualEmployee);
    }
}