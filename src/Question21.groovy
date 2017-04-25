/**
 * Created by akhil on 21/4/17.
 */
import groovy.transform.ToString
/*
* Conside a class named "Employee" which has the following properties:
* 1) Name 2) Age 3) DepartmentName 4) EmployeeNumber
* 5) Salary
* Let's say that there's a list of 50 employees available.
* Perform the following operations on the list of employees:
Group the employees on the basis of the bracket in which their salary falls.
The ranges are 0-5000, 5001 and 10000, and so on.
Get a count of the number of employees in each department
Get the list of employees whose age is between 18 and 35
Group the employees according to the alphabet with which their first name starts and
display the number of employees in each group whose age is greater than
Group the employees according to their department.
* */

class Question21 {
    static void main(String[] args) {
        List list = []
        EmployeeDep employeeDep1 = new EmployeeDep(name: "Prahant", age: 25, salary: 50000, departmentNumber: 10, employeeNumber: 1);
        EmployeeDep employeeDep2 = new EmployeeDep(name: "Akhil", age: 25, salary: 4000, departmentNumber: 10, employeeNumber: 2);
        EmployeeDep employeeDep3 = new EmployeeDep(name: "Ajay", age: 39, salary: 10000, departmentNumber: 20, employeeNumber: 3);
        EmployeeDep employeeDep4 = new EmployeeDep(name: "Mayank", age: 24, salary: 2000, departmentNumber: 20, employeeNumber: 4);
        EmployeeDep employeeDep5 = new EmployeeDep(name: "Ishwar", age: 17, salary: 3000, departmentNumber: 30, employeeNumber: 5);
        list = [employeeDep1, employeeDep2, employeeDep3, employeeDep4, employeeDep5]

        // Group the employees on the basis of the bracket in which their salary falls.
        // The ranges are 0-5000, 5001 and 10000, and so on.
        def result = list.groupBy { it ->
            def num = it.salary - (it.salary % 5000)
            return "${num} - ${num + 5000}"
        }

        println(result.keySet())
        println(result.values())

        // Get a count of the number of employees in each department
        def countEmployeedepartement = list.countBy { it.departmentNumber }
        assert countEmployeedepartement == [10: 2, 20: 2, 30: 1]
        println("Count of the number of employees in each department: " + countEmployeedepartement)

        //Get the list of employees whose age is between 18 and 35
        def employeeAge = list.findAll { it.age > 18 && it.age < 35 }
        assert employeeAge*.name == ['Prahant', 'Akhil', 'Mayank']
        println("List of employees whose age is between 18 and 35: " + employeeAge*.name)

        //Group the employees according to the alphabet with which their first name starts and
        // display the number of employees in each group whose age is greater than 20
        def employeesByName = list.groupBy { it.name[0] }
        assert employeesByName.count { it.key } == 4
        println("Employees according to the alphabet with which their first name starts ( Key ): " + employeesByName.keySet())
        println("Employees according to the alphabet with which their first name starts ( Value.name ): " + employeesByName.values().name)
        employeesByName.each {
            println it.key + " : " + it.value.count { itr -> itr.age > 20 }
        }

        // Group the employees according to their department.
        def groupEmployeeDepartment = list.groupBy { it.departmentNumber }
        assert groupEmployeeDepartment.values().name == [['Prahant', 'Akhil'], ['Ajay', 'Mayank'], ['Ishwar']]
        println("Group the employees according to their department: " + groupEmployeeDepartment.keySet() + groupEmployeeDepartment.values().name)
    }
}

@ToString
class EmployeeDep {
    String name
    byte age
    int departmentNumber
    int employeeNumber
    double salary
}
