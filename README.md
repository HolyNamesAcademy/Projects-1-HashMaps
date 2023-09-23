# Project: Hash Maps

## Table of Contents

- [Project: Hash Maps](#project-hash-maps)
  - [Table of Contents](#table-of-contents)
  - [Good work pledge](#good-work-pledge)
  - [Getting started](#getting-started)
  - [Project overview](#project-overview)
  - [Program contents](#program-contents)
    - [Application classes](#application-classes)
      - [Employee](#employee)
      - [CompanyDirectoryArrayList and CompanyDirectoryHashMap](#companydirectoryarraylist-and-companydirectoryhashmap)
      - [Main](#main)
    - [Test classes](#test-classes)
    - [Benchmarking](#benchmarking)
      - [What is Benchmarking?](#what-is-benchmarking)
      - [Running Benchmarks](#running-benchmarks)
      - [Understanding Benchmark Results](#understanding-benchmark-results)
      - [Report](#report)
  - [Extra Credit](#extra-credit)
    - [Update Employee Office](#update-employee-office)
    - [Read and Write Employee Information to a File](#read-and-write-employee-information-to-a-file)
    - [Implement an Additional Benchmark](#implement-an-additional-benchmark)
  - [Turning in the project](#turning-in-the-project)
  - [Grading rubric](#grading-rubric)

## Good work pledge

We are here to broaden your exposure to Computer Science. We can only achieve that purpose when you work
hard and honestly. It may be tempting to copy-paste code from a classmate, or let a classmate do all
your work for you don't! You will be cheating yourself from the most valuable thing course has to offer:
overcoming challenges.

We know that hard, and honest work doesn't come easily. If you feel like you are falling behind

  1. Don't copy-paste code, or let someone do your work for you
  2. Ask for help!
  3. Tell the teaching team you need more time

## Getting started

  1. Go to the provided assignment link, and click accept. It should take you to your project page.
     (If it doesn't, click on the link above again, and click on the link to the project page).
  2. On the GitHub project page, click on the green "Clone or Download" button and copy the link.
  3. Open IntelliJ, click on the "Checkout from Version Control" drop down and select "GitHub"
  4. On the next page paste the link you copied into the "Git Repository URL" box.
  5. Click Clone. You may have to enter your GitHub username and password.
  6. If it asks you whether you want to open the project or not, select yes.
  7. You should see your project open. If you need to reopen the project, you should see it under
     "File > Open Recent"
  8. If you click on the drop-down menu of run configurations, you should see "Main", "TODO", and
     "TODO" as options. You should be able to run all of them. If any of the configurations are missing,
     call an instructor over.

## Project overview

This project implements a directory of employees at a company. You will write code that implements the
directory twice – once using an ArrayList and once using a HashMap. The purpose of implementing the
directory twice is to help understand the differences between ArrayLists and HashMaps, and in which
situations one may be better than the other.

To help illustrate this, you will also run ["benchmarks"](#benchmarking) to measure the efficiency of the
operations for each implementation.

There are three parts of this assignment:

  1. Write the application code
  2. Write tests
  3. Run benchmarks and report findings

## Program contents

The program contains three packages:

  * `main`: source code that comprises the application itself
  * `test`: tests that ensure the code in the `main` package works as expected
  * `benchmark`: code that times how long various operations take to complete

### Application classes

These classes contain the code for the employee directory application you'll be writing. To run the
program, select the "Main" run configuration at the top right corner of the screen and click the
green triangle (the "run" button) to the right.

#### Employee

The `Employee` class represents basic information about an employee at a company. An `Employee`
instance keeps track of that employee's name and where they work (building name and office number).

_You do NOT need to make changes to this class._

#### CompanyDirectoryArrayList and CompanyDirectoryHashMap

The `CompanyDirectoryArrayList` and `CompanyDirectoryHashMap` classes both maintain information about
employees at a company. While they implement the same functions described below, they use different
data structures internally. As the names suggest, `CompanyDirectoryArrayList` and
`CompanyDirectoryHashMap` maintain employee information in an ArrayList and HashMap, respectively.

You'll need to implement the following functions in both classes:

| Function                              | Description  |
| ------------------------------------- | ------------ |
| `void addEmployee(Employee employee)` | Adds a new employee to the directory. |
| `Employee findEmployeeByName(String employeeName)` | Finds an existing employee in the directory by their name. |
| `Employee findEmployeeByOffice(String buildingName, int officeNumber)` | Finds an existing employee in the directory by their office. |
| `void DisplayAllEmployees()` | Prints information about all employees. |

#### Main

  * The `Main` class serves as the user interface. The `main()` method first asks the user if they want to
    keep track of their employees using an ArrayList or a HashMap. The program will then create a
    `CompanyDirectoryArrayList` or `CompanyDirectoryHashMap` and use it for the duration of the program.
  * Users can then add employees to the directory, find them by name, find them by their office, or display
    information about all employees in the directory. The program will run until in a loop until the user
    decides to quit the program.
  * Note that employee information is not maintained between runs of your program. We'd need to leverage
    file I/O for that!
  * _You do NOT need to make changes to this class._

### Test classes

  * To ensure that the application code works as expected, write tests in `CompanyDirectoryArrayListTests`
    and `CompanyDirectoryHashMapTests`; there are run configurations already available to run them.
  * For details about what each test should do, see the comments / descriptions in the code.

### Benchmarking

#### What is Benchmarking?

[Benchmarking](https://en.wikipedia.org/wiki/Benchmark_(computing)) is a process for measuring how your
program runs. Benchmarking is can be used to measure the amount of memory your program takes up on the
computer, what percentage of the processor's capacity it is utilizing, etc. In our case, we'll be using
this technique to measure how long certain operations take for the program to complete.

We leverage the [Java Microbenchmark Harness (JMH)](tutorials.jenkov.com/java-performance/jmh.html) to
declare and execute our benchmarks.

#### Running Benchmarks

  * In order to execute benchmarks in IntelliJ, you will need to install the
    [JMH plugin](https://plugins.jetbrains.com/plugin/7529-jmh-plugin). After installing it, restart
    IntelliJ for the changes to take effect.
  * Similar to running tests, there is a run configuration provided for you that will run all the
    benchmarks. From the drop-down menu in the top-right corner, select the "CompanyDirectoryBenchmarks"
    configuration and click the green "Play" button to run all the benchmarks.
  * Note that running all the benchmarks will take about 5 minutes to complete.

#### Understanding Benchmark Results

When you run one or more benchmarks, you will see output displays metric from the benchmarks. For example:

```sh
# Run complete. Total time: 00:05:14

Benchmark                    Mode  Cnt    Score    Error  Units
MyAwesomeFunction            avgt   25  205.127 ±  4.831  us/op
BetterThanAwesomeFunction    avgt   25   78.633 ±  5.063  us/op
WorseThanAwesomeFunction     avgt   25  839.522 ± 39.274  us/op
```

| Column    | Meaning                                           |
| --------- | ------------------------------------------------- |
| Benchmark | The name of the benchmark that ran.               |
| Mode      | For us, this will always be `avgt`, i.e. the benchmark measures the average time per execution. |
| Cnt       | The number of times the benchmark ran.            |
| Score     | The average time it took to execute the function. |
| Error     | The margin of error for the measured value.       |
| Units     | The units of measurement for the "Score" column.  |

#### Report

Once you've written your application code and have ensured it works by writing unit tests, we are ready
to run our benchmarks and get results.

We have put a new page for this report in your OneNote in a page called "Project 6: Benchmarks Report";
you should put your hypotheses and results here.

  1. Before running the benchmarks, consider how the same operations in `CompanyDirectoryArrayList` and
     `CompanyDirectoryHashMap` might compare. Based on what you know about how ArrayLists and HashMaps
     work (at a high level), do you expect one or the other to be faster for a given operation? Do you
     expect them to be about the same? Why? Record your hypothesis for each kind of operation
     (`addEmployee`, `findEmployeeByName`, `findEmployeeByOffice`).
  2. Run the benchmarks as described above.
  3. For each function, put the average time per operation in the table, as reported by
     the benchmarking process.
  4. Compare the result for each operation against your hypothesis. Was your hypothesis correct?
     Describe the results in a paragraph or two. Were certain operations faster for one implementation
     or the other? Did certain operations take similar amounts of time?
       * It's ok if any of your hypotheses were incorrect; that's how the scientific method works!
         Don't change your hypothesis after the fact. Whether or not your hypotheses were correct will
         not be a factor in your grade, however your explanations will.

## Extra Credit

### Update Employee Office

There is an additional function `updateEmployeeOffice` that you can implement for a company directory.
When implemented, it should allow you to change the office location for an employee already in the directory.
Do this for both the ArrayList and HashMap directories and complete the corresponding tests.

### Read and Write Employee Information to a File

As mentioned previously, employee information is not persisted when the program stops running.
Using file I/O techniques, save employee information to a file when the program ends. Each employee's
information should be on its own line in the output file.

For additional credit after implementing the code that writes employee information to an output file, add
functionality that will read the same file when the program starts. Make this optional for the user, so
that they can always start with a new directory if they so choose.

### Implement an Additional Benchmark

Create an additional benchmark and report the results. If you decide to do this, ask a teacher to
explain more about how to write benchmarks to ensure you do this correctly.

## Turning in the project

Follow the guidelines in the IntelliJ Setup page to turn in your assignment.

## Grading rubric

| <h2>Component</h2>                           | <h2>Possible points</h2> |
| :------------------------------------------- | -----------------------: |
| <h3>CompanyDirectoryArrayList</h3>           | <h3>20 pts</h3> |
| `addEmployee()`                              | 5 pts |
| `findEmployeeByName()`                       | 5 pts |
| `findEmployeeByOffice()`                     | 5 pts |
| `displayAllEmployees()`                      | 5 pts |
| <h3>CompanyDirectoryArrayHashMap</h3>        | <h3>20 pts</h3> |
| `addEmployee()`                              | 5 pts |
| `findEmployeeByName()`                       | 5 pts |
| `findEmployeeByOffice()`                     | 5 pts |
| `displayAllEmployees()`                      | 5 pts |
| <h3>CompanyDirectoryArrayList test</h3>      | <h3>5 pts</h3> |
| <h3>CompanyDirectoryHashMap test</h3>        | <h3>5 pts</h3> |
| <h3>Benchmark Report</h3>                    | <h3>10 pts</h3> |
| <h3>Code Quality</h3>                        | <h3>20 pts</h3> |
| No compile errors                            | 10 pts |
| [Code spaced and indented properly]          | 10 pts |
| [Descriptive variable names]                 | 5 pts |
| <h3>Administrative</h3>                      | <h3>20 pts</h3> |
| Correctly pushed to GitHub                   | 5 pts |
| Turned in on time                            | 15 pts |
| <h3>Extra Credit</h3>                        | <h3>15 pts</h3> |
| Update employee office location              | 10 pts |
| Write employee information to a file         | 5 pts |
| Read employee information from a file        | 5 pts |
| Implement an additional benchmark            | 5 pts |
| <h3>Total</h3> (not including extra credit)  | <h3>100 pts</h3> |

[Code spaced and indented properly]: https://stackoverflow.com/questions/17879475/how-enable-auto-format-code-for-intellij-idea
[Descriptive variable names]: http://www.makinggoodsoftware.com/2009/05/04/71-tips-for-naming-variables
