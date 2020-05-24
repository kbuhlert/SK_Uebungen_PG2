package Personalverwaltung2;

import Personalverwaltung.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager2 {
    private List<Employee> employeeList;

    public void addEmployee (Employee e){
        employeeList.add(e);
    }
    public Employee findByEmpNumber(int number){
        for (Employee e:employeeList){
            if(e.getEmpNumber()==number){
                return e;
            }
        }return null;
    }

    public ArrayList<Employee> mitarbeiterInDepartment(String department){

        ArrayList<Employee> mitarbeiterDepartment = new ArrayList<>();

        for (Employee e:employeeList){
            if(e.getDepartment().equals(department)){
                mitarbeiterDepartment.add(e);
            }
        }
        return mitarbeiterDepartment;
    }

    public Employee findByMaxSalary(){
        Employee teurerMitarbeiter = null;
        double maxSalary = 0;
        for (Employee e:employeeList){
             if(maxSalary<e.getSalary()){
                 maxSalary = e.getSalary();
             }
        }
        for (Employee e:employeeList){
            if(maxSalary==e.getSalary()){
                teurerMitarbeiter = e;
            }
        }
        return teurerMitarbeiter;
    }

    public Employee nachName (String name){
        Iterator<Employee> i = employeeList.iterator();
        while(i.hasNext())
        { Employee e =i.next();
            if(e.getName().equals(name))
        return e;}
        return null;
    }


}
