import java.util.*;

public class EmployeeRegistrationOOPS {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Registration registration = new Registration();
        int n;
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
            if(n <=0) {
                System.out.println("Please enter a number greater than zero.");
                return;
            }
            for(int i =0; i <=n; i++) {
                String empName = s.nextLine();
                if(empName != null  && empName.length() > 0) {
                    Employee emp = new Employee(empName);
                    registration.register(emp);
                }
            }
            String searchEmpName = s.nextLine();
            registration.getEmployees();
            registration.findEmployee(searchEmpName);
        }
    }
}

class Registration {

    // public Map<String, Employee> registeredList;
    public ArrayList<Employee> registeredList;

    Registration() {
        this.registeredList = new ArrayList<>();
        // this.registeredList = new HashMap<>();
    }

    public boolean register(Employee emp) {
        emp.employeeID = this.registeredList.size()+1;
        this.registeredList.add(emp);
        return true;
    }

    public void findEmployee(String name) {
        int n = this.registeredList.size();
        for(int i = 0; i < n; i++) {
            Employee emp = this.registeredList.get(i);
            if(emp.name.equals(name)) {
                System.out.println(emp.showEmployee());
               return;
            } 
        }
        System.out.println("N/A");
    }

    public void getEmployees() {
        int n = this.registeredList.size();
        for(int i = 0; i < n; i++) {
            Employee emp = this.registeredList.get(i);
            System.out.println(emp.showEmployee()); 
        }
    }
}

class Employee {
    protected int employeeID;
    public String name;

    Employee(String name) {
        this.name = name;
    }

    public String showEmployee() {
        return this.employeeID+ ": "+this.name;
    }
}

