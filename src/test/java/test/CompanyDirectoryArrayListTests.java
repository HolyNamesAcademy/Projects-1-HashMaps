package test;

import main.CompanyDirectoryArrayList;
import main.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyDirectoryArrayListTests {

    @Test
    public void addContact() {
        CompanyDirectoryArrayList directory = new CompanyDirectoryArrayList();
        String expectedEmployeeName = "Paul McCartney";
        Employee expectedEmployee = new Employee(expectedEmployeeName, "Abbey Road", 1969);
        directory.addEmployee(expectedEmployee);

        Employee actualEmployee = directory.getAllEmployees().get(0);
        assertEquals(expectedEmployee, actualEmployee);
    }

    @Test
    public void findEmployeeByName() {
        CompanyDirectoryArrayList directory = new CompanyDirectoryArrayList();
        String expectedEmployeeName = "Paul McCartney";
        Employee expectedEmployee = new Employee(expectedEmployeeName, "Abbey Road", 1969);
        directory.addEmployee(expectedEmployee);

        Employee actualEmployee = directory.findEmployeeByName(expectedEmployeeName);
        assertEquals(expectedEmployee, actualEmployee);
    }

    @Test
    public void findEmployeeByOffice() {
        CompanyDirectoryArrayList directory = new CompanyDirectoryArrayList();
        String expectedBuildingName = "Red House";
        int expectedOfficeNumber = 1967;
        Employee expectedEmployee = new Employee("Jimi Hendrix", expectedBuildingName, expectedOfficeNumber);
        directory.addEmployee(expectedEmployee);

        Employee actualEmployee = directory.findEmployeeByOffice(expectedBuildingName, expectedOfficeNumber);
        assertEquals(expectedEmployee, actualEmployee);
    }
}
