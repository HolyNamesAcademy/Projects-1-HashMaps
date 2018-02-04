import main.CompanyDirectoryHashMap;
import main.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyDirectoryHashMapTests {

    @Test
    public void addContact() {
        CompanyDirectoryHashMap d = new CompanyDirectoryHashMap();
        Employee employee = new Employee("name", "building", 100);
        d.addEmployee(employee);
    }

    @Test
    public void findContact() {
    }

    @Test
    public void findContactWithOffice() {
    }

    @Test
    public void getEmployees() {
    }
}