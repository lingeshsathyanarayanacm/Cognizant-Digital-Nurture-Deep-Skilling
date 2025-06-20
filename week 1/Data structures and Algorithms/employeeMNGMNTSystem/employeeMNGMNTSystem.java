import java.util.*;
class employee{
    private int id;
    private String name;
    private String pos;
    private double salary;

    public employee(int id , String name, String pos,double salary){
        this.id = id;
        this.name=name;
        this.pos = pos;
        this.salary = salary;
    }
    public int getEmployeeid(){ return id;}
    public String getName(){ return name;}
    public String getPos(){return pos;}
    public double getSalary(){ return salary;}

    public void setEmployeeId(int id){ this.id = id;}
    public void setName (String name){this.name = name;}
    public void setPos (String pos){this.pos = pos;}
    public void Setsalary(double salary){this.salary = salary;}

    @Override
    public String toString(){
        return "Employee [ID=" + id + ", Name=" + name + ", Position=" + pos + ", Salary=" + salary + "]";
    }

}
public class employeeMNGMNTSystem {
    private employee[] emps;
    private int count;

    public employeeMNGMNTSystem(int cap){
        emps = new employee[cap];
        count = 0;
    }
    public void addEmployee(employee employee){
        if(count < emps.length){
            emps[count++]  = employee;
        }
        else{
            System.out.println("Employee list is full");
        }
    }

    public employee searcEmployee(int empID){
        for(employee e : emps){
            if(e.getEmployeeid() == empID){
                return e;
            }
        }
        return null;
    }

    public void traverseEmp(){
        for(employee e :emps){
            System.out.println(e);
        }
    }

    public void delEmp(int empID){
        for (int i = 0; i < count; i++) {
            if (emps[i].getEmployeeid() == empID) {
                emps[i] = emps[count - 1]; 
                emps[count - 1] = null; 
                count--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        System.out.println("Enter number of employees:");
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt();
        employeeMNGMNTSystem em = new employeeMNGMNTSystem(cap);
        for(int i=0;i<cap;i++){
            int id;
            String name, des;
            double salary;
            System.out.println("employee id:");
            id = sc.nextInt();
            System.out.println("employee name:");
            name = sc.next();
            System.out.println("employee post:");
            des = sc.next();
            System.out.println("employee salary:");
            salary = sc.nextDouble();
            em.addEmployee(new employee(id,name,des,salary));
        }
        System.out.println("All Employees:");
        em.traverseEmp();
        System.out.println("Enter ID of employee to search:");
        int id = sc.nextInt();
        employee e = em.searcEmployee(id);
        if (e != null) {
            System.out.println(e);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("Enter ID of employee to delete:");
        id = sc.nextInt();
        em.delEmp(id);
        System.out.println("\nAll Employees after deletion:");
        em.traverseEmp();
        sc.close();
    }
}
