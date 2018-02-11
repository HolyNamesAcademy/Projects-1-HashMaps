# Project 6: Hash Maps

## Table of Contents

* [Good work pledge](#good-work-pledge)
* [Getting started](#getting-started)
* [Project overview](#project-overview)
* [Program contents](#program-contents)
  * [Application classes](#application-classes)
    * [Employee](#employee)
    * [CompanyDirectoryArrayList and CompanyDirectoryHashMap](#companydirectoryarraylist-and-companydirectoryhashmap)
    * [Main](#main)
  * [Test classes](#test-classes)
  * [Benchmarking](#benchmarking)
    * [What is Benchmarking?](#what-is-benchmarking)
    * [Running Benchmarks](#running-benchmarks)
    * [Understanding Benchmark Results](#understanding-benchmark-results)
* [Extra credit](#extra-credit)
   * [TODO](#TODO)
* [Turning in the project](#turning-in-the-project)
* [Grading rubric](#grading-rubric)

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
  3. Open Intellij, click on the "Checkout from Version Control" drop down and select "GitHub"
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
directory twice is to help understand the differences between ArrayLists and HashMaps, and for which
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
| `Employee findEmployeeByName(String contactName)` | Finds an existing employee in the directory by their name. |
| `Employee findEmployeeByOffice(String buildingName, int officeNumber)` | Finds an existing employee in the directory by their office. |
| `void DisplayAllEmployees()` | Prints information about all employees. |

#### Main

The `Main` class serves as the user interface. The `main()` method first asks the user if they want to
keep track of their employees using an ArrayList or a HashMap. The program will then create a
`CompanyDirectoryArrayList` or `CompanyDirectoryHashMap` and use it for the duration of the program.

Users can then add employees to the directory, find them by name, find them by their office, or display
information about all employees in the directory. The program will run until in a loop until the user
decides to quit the program.

Note that employee information is not maintained between runs of your program. We'd need to leverage
file I/O for that!

_You do NOT need to make changes to this class._

### Test classes

To ensure that the application code works as expected, write tests in `CompanyDirectoryArrayListTests`
and `CompanyDirectoryHashMapTests`; there are run configurations already available to run them.

For details about what each test should do, see the comments / descriptions in the code.

### Benchmarking

#### What is Benchmarking?

[Benchmarking](https://en.wikipedia.org/wiki/Benchmark_(computing)) is a process for measuring how your
program runs. Benchmarking is can be used to measure the amount of memory your program takes up on the
computer, what percentage of the processor's capacity it is utilizing, etc. In our case, we'll be using
this technique to measure how long certain operations take for the program to complete.

#### Running Benchmarks

list each benchmark
explain anatomy?

#### Understanding Benchmark Results

#### Report

Once you've written your application code and have ensured it works by writing unit tests, we are ready
to run our benchmarks and get results.

  1. Before running the benchmarks, consider how the same operations in `CompanyDirectoryArrayList` and
     `CompanyDirectoryHashMap` might compare. Based on what you know about how ArrayLists and HashMaps
     work (at a high level), do you expect one or the other to be faster for a given operation? Do you
     expect them to be about the same? Why? Record your hypothesis for each kind of operation
     (`addEmployee`, `findEmployeeByName`, `findEmployeeByOffice`).
  2. Run the benchmarks as described above.
  3. Compare the result for each operation against your hypothesis. Was your hypothesis correct? If not,
     why? It's ok if any of your hypotheses were incorrect; that's how the scientific method works!
     Don't change your hypothesis after the fact. Whether or not your hypotheses were correct will not
     be a factor in your grade, however your explanations will.
  4. Create a short report and describe your findings.
  TODO: what format and where to put it?? create markdown file in repo, edit it there

## Extra credit

### TODO

  * save employees to file?
  * Implement additional benchmark?

## Turning in the project

Follow the guidelines in the IntelliJ Setup page to turn in your assignment.

## Grading rubric

TODO TODO
TODO TODO

| <h3>CmuDict</h3> | <h3>20 pts</h3> |
| :------------- | -----: |
| isWordEntry() | 5 pts |
| getWord() | 5 pts |
| getPhonemes() | 5 pts |
| getDictLineForWord() | 5 pts |
| <h3>WordRhymer</h3> | <h3>20 pts</h3> |
| finalPhonemesMatch() | 5 pts |
| findRhymingWords() | 15 pts |
| <h3>CmuDictTest (5 points per test)</h3> | <h3>35 pts</h3> |
| <h3>WordRhymerTest (5 points per test)</h3> | <h3>20 pts</h3> |
| <h3>Code Quality</h3> | <h3>20 pts</h3> |
| No compile errors | 10 pts |
| [Code spaced and indented properly](https://stackoverflow.com/questions/17879475/how-enable-auto-format-code-for-intellij-idea) | 10 pts |
| [Descriptive variable names](http://www.makinggoodsoftware.com/2009/05/04/71-tips-for-naming-variables) | 5 pts |
| <h3>Administrative</h3> | <h3>20 pts</h3> |
| Correctly pushed to GitHub | 5 pts |
| Turned in on time | 15 pts |
| <h3>Extra Credit</h3> | <h3>20 pts</h3> |
| Handling bogus input in CmuDict methods | 5 pts |
| Making CmuDict more efficient | 5 pts |
| Improving the rhyming algorithm | 5 pts |
| Rhyme words that aren't in the dictionary | 5 pts |
| <h3>Total</h3> (not including extra credit) | <h3>135 pts</h3> |
