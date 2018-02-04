package main;

import main.Employee;

public interface ICompanyDirectory {

    void addEmployee(Employee employee);
    boolean addOrReplaceEmployee(Employee employee);
    Employee findEmployeeByName(String contactName);
    Employee findEmployeeByOffice(String buildingName, int officeNumber);

}
