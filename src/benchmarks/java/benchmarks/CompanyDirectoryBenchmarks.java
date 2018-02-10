package benchmarks;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import main.CompanyDirectoryArrayList;
import main.CompanyDirectoryHashMap;
import main.Employee;
import org.openjdk.jmh.annotations.*;

@BenchmarkMode(Mode.AverageTime)        // Measure the average time it takes to complete each operation
@OutputTimeUnit(TimeUnit.MICROSECONDS)  // Display all times in microseconds ('μs' or 'us')
@Fork(5)                                // Run each full benchmark (warm-ups + measured iterations) 5 times
@Warmup(iterations = 3)                 // Run 3 "warm-up" iterations for each benchmark run, which are NOT measured
@Measurement(iterations = 5)            // Run 5 iterations for each benchmark run, which are measured
public class CompanyDirectoryBenchmarks {

    @State(Scope.Thread)
    public static class MyState {
        public CompanyDirectoryHashMap directoryHashMap;
        public CompanyDirectoryArrayList directoryArrayList;

        private static final int InitialNumberOfEmployees = 10000;

        @Setup(Level.Trial)    // run the setup once before each full benchmark run (fork)
        public void setup() {
            this.directoryHashMap = new CompanyDirectoryHashMap();
            this.directoryArrayList = new CompanyDirectoryArrayList();

            // insert 10000 random employees into the directory
            for (int i = 0; i < InitialNumberOfEmployees; i++) {
                String name = UUID.randomUUID().toString();
                String building = UUID.randomUUID().toString();
                int officeNumber = ThreadLocalRandom.current().nextInt(1, 100);
                Employee employee = new Employee(name, building, officeNumber);
                this.directoryArrayList.addEmployee(employee);
                this.directoryHashMap.addEmployee(employee);
            }
        }
    }

    /*
     * Add a new employee to an ArrayList-based directory.
     */
    @Benchmark
    public void AddEmployeeHashMap(MyState state) {
        String name = UUID.randomUUID().toString();
        Employee employee = new Employee(name, "building", 100);
        state.directoryHashMap.addEmployee(employee);
    }

    /*
     * Add a new employee to a HashMap-based directory.
     */
    @Benchmark
    public void AddEmployeeArrayList(MyState state) {
        String name = UUID.randomUUID().toString();
        Employee employee = new Employee(name, "building", 100);
        state.directoryArrayList.addEmployee(employee);
    }

    /*
     * Add a new employee to the end of an ArrayList-based directory and find them by their name.
     */
    @Benchmark
    public void FindEmployeeArrayList(MyState state) {
        String name = "Aretha Franklin";
        Employee employee = new Employee(name, "Muscle Shoals", 75);
        state.directoryArrayList.addEmployee(employee);
        state.directoryArrayList.findEmployeeByName(name);
    }

    /*
     * Add a new employee to a HashMap-based directory and find them by their name.
     */
    @Benchmark
    public void FindEmployeeHashMap(MyState state) {
        String name = "Aretha Franklin";
        Employee employee = new Employee(name, "Muscle Shoals", 75);
        state.directoryHashMap.addEmployee(employee);
        state.directoryHashMap.findEmployeeByName(name);
    }

    /*
     * Add a new employee to the end of the ArrayList-based directory and find them by their office.
     */
    @Benchmark
    public void FindEmployeeByOfficeArrayList(MyState state) {
        String name = "Aretha Franklin";
        Employee employee = new Employee(name, "Muscle Shoals", 75);
        state.directoryArrayList.addEmployee(employee);
        state.directoryArrayList.findEmployeeByOffice(employee.getBuildingName(), employee.getOfficeNumber());
    }

    /*
     * Add a new employee to the HashMap-based directory and find them by their office.
     */
    @Benchmark
    public void FindEmployeeByOfficeHashMap(MyState state) {
        String name = "Aretha Franklin";
        Employee employee = new Employee(name, "Muscle Shoals", 75);
        state.directoryHashMap.addEmployee(employee);
        state.directoryHashMap.findEmployeeByOffice(employee.getBuildingName(), employee.getOfficeNumber());
    }

    // TODO: other potential benchmarks
    // find employee by name, not in directory
    // find employee at beginning
}
