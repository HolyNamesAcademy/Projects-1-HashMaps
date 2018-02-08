package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ICompanyDirectory directory = null;
        do {
            System.out.print("Choose an implementation (\"ArrayList\" or \"HashMap\"): ");
            String implementation = getNextInput(in);
            if (implementation.equalsIgnoreCase("ArrayList")) {
                directory = new CompanyDirectoryArrayList();
            } else if (implementation.equalsIgnoreCase("HashMap")) {
                directory = new CompanyDirectoryHashMap();
            } else {
                String message = String.format("Unrecognized option '%s'", implementation);
                Log(LogLevel.WARNING, message);
            }
        } while(directory == null);

        String commandString;
        do {
            System.out.println("(q)  Quit");
            System.out.println("(a)  Add employee");
            System.out.println("(fn) Find Employee by Name");
            System.out.println("(fo) Find Employee by Office");
            System.out.println("(d)  Display all employees");
            System.out.print("Choose an option: ");

            commandString = getNextInput(in).toLowerCase();

            switch (commandString) {
                case "q":
                    break;
                case "a":
                    AddEmployee(directory, in);
                    break;
                case "fn":
                    FindEmployeeByName(directory, in);
                    break;
                case "fo":
                    FindEmployeeByOffice(directory, in);
                    break;
                case "d":
                    directory.DisplayAllEmployees();
                    break;
                default:
                    String message = String.format(
                            "Unrecognized option '%s'; valid options are 'q', 'a', 'fn' and 'fo'",
                            commandString);
                    Log(LogLevel.WARNING, message);
                    break;
            }
        } while(!commandString.equalsIgnoreCase("q"));
    }

    private static void AddEmployee(ICompanyDirectory directory, Scanner in) {
        String name = getNextInput(in, "Employee name");
        String buildingName = getNextInput(in, "Building name");
        String officeNumberString = getNextInput(in, "Office number");
        int officeNumber = Integer.parseInt(officeNumberString);

        Employee employeeToAdd = new Employee(name, buildingName, officeNumber);
        directory.addEmployee(employeeToAdd);

        Log(LogLevel.SUCCESS, "New employee added to the company directory: " + employeeToAdd.toString());
    }

    private static void FindEmployeeByName(ICompanyDirectory directory, Scanner in) {
        String name = getNextInput(in, "Employee name");
        Employee found = directory.findEmployeeByName(name);

        if (found == null) {
            String message = String.format("No employee found with name '%s'", name);
            Log(LogLevel.WARNING, message);
        } else {
            String message = "Found employee: " + found.toString();
            Log(LogLevel.SUCCESS, message);
        }
    }

    private static void FindEmployeeByOffice(ICompanyDirectory directory, Scanner in) {
        String buildingName = getNextInput(in, "Building name");
        String officeNumberString = getNextInput(in, "Office number");
        int officeNumber = Integer.parseInt(officeNumberString);

        Employee found = directory.findEmployeeByOffice(buildingName, officeNumber);
        if (found == null) {
            String message = String.format("No employee found with name '%s'", buildingName);
            Log(LogLevel.WARNING, message);
        } else {
            String message = "Found employee: " + found.toString();
            Log(LogLevel.SUCCESS, message);
        }
    }

    private static void Log(LogLevel logLevel, String message) {
        String fullMessage = String.format("(%s) %s", logLevel.toString(), message);
        System.out.println(fullMessage);
    }

    private static String getNextInput(Scanner in, String title) {
        System.out.print(title + ": ");
        return getNextInput(in);
    }

    private static String getNextInput(Scanner in) {
        return in.nextLine().trim();
    }
}
