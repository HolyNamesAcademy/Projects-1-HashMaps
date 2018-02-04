
public class Employee {
    private String name;
    private String buildingName;
    private int officeNumber;

    public Employee(String name, String buildingName, int officeNumber) {
        this.name = name;
        this.buildingName = buildingName;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getBuildingName() {
        return this.buildingName;
    }

    public int getOfficeNumber() {
        return this.officeNumber;
    }
}
