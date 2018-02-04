package benchmarks;

import main.CompanyDirectoryArrayList;
import main.CompanyDirectoryHashMap;
import main.Employee;
import org.openjdk.jmh.annotations.*;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 3)
@Measurement(iterations = 5)
public class CompanyDirectoryBenchmarks {

    @State(Scope.Thread)
    public static class MyState {
        public CompanyDirectoryHashMap directoryHashMap;
        public CompanyDirectoryArrayList directoryArrayList;

        @Setup(Level.Trial)
        public void setup() {
            this.directoryHashMap = new CompanyDirectoryHashMap();
            this.directoryArrayList = new CompanyDirectoryArrayList();

            for (int i = 0; i < 10000; i++) {
                String name = UUID.randomUUID().toString();
                String building = UUID.randomUUID().toString();
                Employee employee = new Employee(name, building, 100);
                this.directoryArrayList.addEmployee(employee);
                this.directoryHashMap.addEmployee(employee);
            }
        }
    }

    @Benchmark
    public void AddEmployeeHashMap(MyState state) {
        String name = UUID.randomUUID().toString();
        Employee employee = new Employee(name, "building", 100);
        state.directoryHashMap.addEmployee(employee);
    }

    @Benchmark
    public void AddEmployeeArrayList(MyState state) {
        String name = UUID.randomUUID().toString();
        Employee employee = new Employee(name, "building", 100);
        state.directoryArrayList.addEmployee(employee);
    }

    @Benchmark
    public void FindEmployeeHashMap(MyState state) {
        String name = "Aretha Franklin";
        Employee employee = new Employee(name, "Muscle Shoals", 75);
        state.directoryHashMap.addEmployee(employee);
        state.directoryHashMap.findEmployee(name);
    }

    @Benchmark
    public void FindEmployeeArrayList(MyState state) {
        String name = "Aretha Franklin";
        Employee employee = new Employee(name, "Muscle Shoals", 75);
        state.directoryArrayList.addEmployee(employee);
        state.directoryArrayList.findEmployee(name);
    }

    // find employee not in directory
    // find random employee in directory
    // find employee at end
    // find employee at beginning

    //



    // @Benchmark
    // public void FindEmployee(MyState state) {
    //     System.out.println("finding employee");
    //     Employee employee = new Employee("name", "building", 100);
    //     state.directory.findEmployee("name");
    // }
}
