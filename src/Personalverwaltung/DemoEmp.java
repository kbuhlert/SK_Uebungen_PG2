package Personalverwaltung;

public class DemoEmp {
    public static void main(String[] args) {
        Employee a = new Employee(12345,"Mueller", 2500.0, "accounting");
        Employee b = new Employee(12456,"Huber", 2500.0, "management");
        Employee c = new Employee(12489,"Molcany", 4500.0, "accounting");
        Employee d = new Employee(12578,"Jungwirth", 3500.0, "software");

        EmployeeManager employeeList = new EmployeeManager();
        employeeList.addEmployee(a);
        employeeList.addEmployee(b);
        employeeList.addEmployee(c);
        employeeList.addEmployee(d);

        System.out.println("employeeList = " + employeeList);
        System.out.println("-------");

        System.out.println(employeeList.findEmpNumber(12489));
        System.out.println("employeeList.findByDepartment(\"accounting\") = " + employeeList.findByDepartment("accounting"));
        System.out.println("employeeList.findByMAxSalary() = " + employeeList.findByMAxSalary());
        System.out.println("employeeList.findName(\"Huber\") = " + employeeList.findName("Huber"));
    }
}
