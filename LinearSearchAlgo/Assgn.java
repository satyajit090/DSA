package LinearSearchAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Assgn {

    public static void main(String[] args) {


        ArrayList<Employe> emp=new ArrayList<>();
        emp.add(new Employe("Satya",1,7500));
        emp.add(new Employe("Rosan",2,4555));
        emp.add(new Employe("Jeevan",3,2000));

        Collections.sort(emp, new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return CharSequence.compare(o1.getName(),o2.getName());
            }
        });

        for (Employe emplo:emp)
        {
            System.out.println(emplo);
        }


    }

}
class Employe{

    private int id;
    private String name;
    private int salary;

    public Employe(String name, int id, int salary) {
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

    public Employe() {
        super();
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


}
