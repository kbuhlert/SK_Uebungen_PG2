package Personalverwaltung;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeManager {
 private ArrayList<Employee> employeeList = new ArrayList<>();

 public void addEmployee (Employee e){
     employeeList.add(e);
 }

 public Employee findEmpNumber (int number){
     for(Employee e : employeeList){
         if(e.getEmpNumber() == number){
             return e;
         }
     }return null;
 }

    public Employee findName (String name){
        Iterator<Employee> namenVergleich = employeeList.iterator();
        while (namenVergleich.hasNext()){
            Employee e = namenVergleich.next();
            if(e.getName().equals(name)){
                return e;
            }
        }return null;
    }

 public ArrayList<Employee> findByDepartment (String department){
     ArrayList<Employee> result = new ArrayList<>();
     for (Employee e: employeeList){
         if(e.getDepartment().equals(department)){
             result.add(e);
         }
     }
     return result;
 }

 public Employee findByMAxSalary(){
     double maxSalary = 0;
     for(Employee e:employeeList){
         if(maxSalary<e.getSalary()){
             maxSalary = e.getSalary();
         }
     }
     for(Employee e : employeeList){
         if(maxSalary == e.getSalary()){
             return e;
         }
     }
     return null;
 }

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "employeeList=" + employeeList +
                '}';
    }
}
