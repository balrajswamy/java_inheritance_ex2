package ex_26122024;

class Father {
    int money = 3000;
}

class Son extends Father {
    String Name = "Balraj";
}


 class Test_Inheritance {
    
    public static void main(String[] args) {
        Son obj1 = new Son();
        System.out.println("My name is " + obj1.Name);
        System.out.println("I got money from my Father " + obj1.money);
    }
}
