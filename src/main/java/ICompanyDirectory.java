public interface ICompanyDirectory {

    void addContact(Employee employee);
    Employee findContact(String contactName);
    Employee findContactWithOffice(String buildingName, int officeNumber);

}
