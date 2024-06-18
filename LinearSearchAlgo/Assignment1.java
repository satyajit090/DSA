package LinearSearchAlgo;

import java.util.*;

public class Assignment1 {

    public static void main(String[] args) {


        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(new Employee("Satya",1,7500));
        emp.add(new Employee("Rosan",2,4555));
        emp.add(new Employee("jeevan",3,2000));

        Collections.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getSalary(),o2.getSalary());
            }
        });

        for (Employee emplo:emp)
        {
            System.out.println(emplo);
        }


    }

}
class Employee{

    private int id;
    private String name;
    private int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}