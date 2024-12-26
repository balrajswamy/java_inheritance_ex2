package ex_26122024;

public class CreatingMethodClass {
    
    public int add(int a, int b){

        int c;
        c = a+b;
        return c;
    }
    public static void main(String[] args) {
        
        CreatingMethodClass obj1 = new CreatingMethodClass();

        int result = obj1.add(10,20 );

        System.out.println("Summation of two is "+result);
    }
}
