package ex_26122024;

public class ConstructorClass {

    String empName;
    String empDept;
    int empId;

    public ConstructorClass(String eName, String eDept, int eId) {
        this.empName = eName;
        this.empDept = eDept;
        this.empId = eId;
    }

    public void displayMethod(){
        System.out.println("Employee Name:\t"+ this.empName);
        System.out.println("Employee Department:\t"+ this.empDept);
        System.out.println("Employee Id:\t"+ this.empId);
    }
    public static void main(String[] args) {
        
        ConstructorClass obj1 = new ConstructorClass("Balraj","IT Department", 120);
        obj1.displayMethod();
        ConstructorClass obj2 = new ConstructorClass("Ramana","Spirtual Department", 121);
        obj2.displayMethod();


    }
    
}
