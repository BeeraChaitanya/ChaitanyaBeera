package demo;
public class Employee { 
    private int empNo; 
    private String eName; 
    private String company; 
    private int salary; 
 
    // Constructor 
    public Employee(int empNo, String eName, String company, int salary) { 
        System.out.println("Employee got created!!!--->" + eName); 
        this.empNo = empNo; 
        this.eName = eName; 
        this.company = company; 
        this.salary = salary; 
    } 
 
    // toString method 
    @Override 
    public String toString() { 
        return "Employee [empNo=" + empNo + ", eName=" + eName + ", company=" + company + ", salary=" + salary + "]"; 
    } 
 
    // Getter and Setter methods 
    public int getEmpNo() { 
        return empNo; 
    } 
 
    public void setEmpNo(int empNo) { 
        this.empNo = empNo; 
    } 
 
    public String geteName() { 
        return eName; 
    } 
 
    public void seteName(String eName) { 
        this.eName = eName; 
    } 
 
    public String getCompany() { 
        return company; 
    } 
 
    public void setCompany(String company) { 
        this.company = company; 
    } 
 
    public int getSalary() { 
        return salary; 
    } 
 
    public void setSalary(int salary) { 
        this.salary = salary; 
    } 
 
    // Main method for testing 
    public static void main(String[] args) { 
        Employee emp = new Employee(101, "Rakesh", "Microsoft", 10000); 
        System.out.println(emp); 
    } 
}