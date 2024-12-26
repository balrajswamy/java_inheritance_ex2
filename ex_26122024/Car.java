package ex_26122024;



public class Car {
    String Name;
    String Model;
    int Speed;
    

    public void startEngine(String name, String model, int speed){

        System.out.println("Start Enginee!");
        this.Name = name;
        this.Model = model;
        this.Speed = speed;
    }
    public static void main(String[] args) {
        
        Car obj1 = new Car();

        obj1.startEngine("BMW","2020",69);
        System.out.println("Model year:\t"+obj1.Model);
        System.out.println("Car Name:\t"+obj1.Name);
        System.out.println("Car Speed:\t"+obj1.Speed);
    }
}
