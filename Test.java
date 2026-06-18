public class Person{
    String name;
    String id;

    Person(String name, String id){
        this.name = name;
        this.id = id;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Student extends Person{

    int age;
    Student(String name, String id, int age){
        super(name, id);
        this.age = age;
    }
    
    @Override 
    void displayInfo(){
        super.displayInfo();
        System.out.println("Age: " + age);
    }
}

public class Test{
    public static void main(String[]args){
        Person p1 = new Person("kayum","250321072");
        p1.displayInfo();
        Student s1 = new Student("kayum","250321072",24);
        s1.displayInfo();
    }
}