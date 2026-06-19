class Bank{
    String name;
    String branch;
     String accountNumber;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Account Number: " + accountNumber);
    }
}

class Bank1 extends Bank{
    String ifsc;
    @Override
    void display(){
       super.display();
        System.out.println("IFSC: " + ifsc);
    }
}
class Bank2 extends Bank1{
    
    @Override
    void display(){
       super.display();
       
    }
}

public class Opp{
    public static void main(String[]agrs){
         Bank b1 = new Bank();
         b1.name = "John";
         b1.branch = "Main Street";
         b1.accountNumber = "ACC001";
         b1.display();

         Bank1 b2 = new Bank1();
         b2.name = "Alice";
         b2.branch = "Fenitown";
         b2.ifsc = "ABC123";
         b2.accountNumber = "ACC002";
         b2.display();

         Bank2 b3 = new Bank2();
         b3.name = "Bob";
         b3.branch = "Dhakatown";
         b3.ifsc = "XYZ789";
         b3.accountNumber = "ACC001";
         b3.display();
    }
}

