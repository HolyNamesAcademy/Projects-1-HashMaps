public interface ICompanyDirectory {

    void addEmployee(Employee employee);
    Employee findEmployee(String contactName);
    Employee findEmployeeWithOffice(String buildingName, int officeNumber);

}
