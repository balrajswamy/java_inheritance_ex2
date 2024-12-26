package ex_26122024;

public class Father {
    int money = 3000;
}

public class Son extends Father {
    String Name = "Balraj";
}

public class Inheritance {
    public static void main(String[] args) {
        Son obj1 = new Son();
        System.out.println("My name is " + obj1.Name);
        System.out.println("I got money from my Father " + obj1.money);
    }
}
