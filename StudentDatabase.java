import java.util.ArrayList;
import java.util.Scanner;


public class StudentDatabase{
    public static void main(String[]args){

        ArrayList<String> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        OUTER:
        while (true) {
            System.out.println("  Student Database");
            System.out.println("1.New  Student add");
            System.out.println("2.All  Student Database");
            System.out.println("3.Please Software Close");
            System.out.println("  Your Choice (1/2/3):");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Student Name:");
                    System.out.println("Enter Student ID:");
                    String name = input.nextLine();
                    String id = input.nextLine();
                    students.add(name);
                    students.add(id);
                    System.out.println("Student Added Successfully!");
                }
                case 2 -> {
                    System.out.println("All Student Database:");
                    for(String s : students){
                        System.out.println(" " + s);
                    }
                }
                case 3 -> {
                    System.out.println("Closing Software...");
                    break OUTER;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }

    }
}