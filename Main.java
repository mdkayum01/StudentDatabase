public class Users{
    public  int id;
    public String name;
    public  String email;
    public String phone;
    public  String password;
    public  String role;


    Users(int id, String name, String email, String phone, String password, String role){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.role = role;
    }

void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Password: " + password);
        System.out.println("Role: " + role);
    }
} 
public class Doctor extends Users{
    public String specialization;
    public String availability;

    Doctor(int id, String name, String email, String phone, String password, String role, String specialization, String availability){
        super(id, name, email, phone, password, role);
        this.specialization = specialization;
        this.availability = availability;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("Availability: " + availability);
    }
}
public class Patient extends Users{
    public String medicalHistory;

    Patient(int id, String name, String email, String phone, String password, String role, String medicalHistory){
        super(id, name, email, phone, password, role);
        this.medicalHistory = medicalHistory;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Medical History: " + medicalHistory);
    }
}
public class Appointment extends Users{
    public String appointmentDate;
    public String appointmentTime;

    Appointment(int id, String name, String email, String phone, String password, String role, String appointmentDate, String appointmentTime){
        super(id, name, email, phone, password, role);
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Appointment Time: " + appointmentTime);
    }
}
public class DoctorAppointment extends Appointment{
    public String doctorName;

    DoctorAppointment(int id, String name, String email, String phone, String password, String role, String appointmentDate, String appointmentTime, String doctorName){
        super(id, name, email, phone, password, role, appointmentDate, appointmentTime);
        this.doctorName = doctorName;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Doctor Name: " + doctorName);
    }
}
public class Prescription extends Appointment{
    public String prescriptionDetails;

    Prescription(int id, String name, String email, String phone, String password, String role, String appointmentDate, String appointmentTime, String prescriptionDetails){
        super(id, name, email, phone, password, role, appointmentDate, appointmentTime);
        this.prescriptionDetails = prescriptionDetails;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Prescription Details: " + prescriptionDetails);
    }
}
public class Payment extends Users{
    public String paymentMethod;
    public double amount;

    Payment(int id, String name, String email, String phone, String password, String role, String paymentMethod, double amount){
        super(id, name, email, phone, password, role);
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Amount: $" + amount);
    }
}
public class MedicalRecord extends Users{
    public String recordDetails;

    MedicalRecord(int id, String name, String email, String phone, String password, String role, String recordDetails){
        super(id, name, email, phone, password, role);
        this.recordDetails = recordDetails;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Medical Record Details: " + recordDetails);
    }
}
public class Main{
    public static void main(String[] args){
        Users user1 = new Users(1, "John Doe", "john.doe@example.com", "098-765-4321", "password456", "Patient");
        user1.displayInfo();
        Users user2 = new Users(2, "Jane Smith", "jane.smith@example.com", "098-765-4321", "password789", "Patient");
        user2.displayInfo();
        Users user3 = new Users(3, "Bob Johnson", "bob.johnson@example.com", "098-765-4321", "password123", "Patient");
        user3.displayInfo();
        
        Doctor doctor1 = new Doctor(4, "Dr. Alice Brown", "alice.brown@example.com", "098-765-4321", "password000", "Doctor", "Cardiology", "Mon-Fri 9AM-5PM");
        doctor1.displayInfo();

        Patient patient1 = new Patient(5, "Charlie Wilson", "charlie.wilson@example.com", "098-765-4321", "password321", "Patient", "Allergies to penicillin");
        patient1.displayInfo();

        DoctorAppointment doctorAppointment1 = new DoctorAppointment(6, "David Lee", "david.lee@example.com", "098-765-4321", "password654", "Patient", "2023-10-15", "10:00 AM", "Dr. Alice Brown");
        doctorAppointment1.displayInfo();

        Prescription prescription1 = new Prescription(7, "Eve Davis", "eve.davis@example.com", "098-765-4321", "password987", "Patient", "2023-10-15", "10:00 AM", "Amoxicillin 500mg, 3 times daily for 7 days");
        prescription1.displayInfo();

        Payment payment1 = new Payment(8, "Frank Miller", "frank.miller@example.com", "098-765-4321", "password246", "Patient", "Credit Card", 150.00);
        payment1.displayInfo();

        MedicalRecord medicalRecord1 = new MedicalRecord(9, "Grace Hall", "grace.hall@example.com", "098-765-4321", "password579", "Patient", "Regular check-up, blood pressure normal");
        medicalRecord1.displayInfo();
    }
}