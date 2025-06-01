import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor = new Doctor("Dr. Smith", 45, "Male", "D101", "Cardiology");
        Patient patient = new Patient("Alice", 30, "Female", "P001");
        Treatment treatment = new Treatment("T001", "Heart Checkup", 2000.0);
        Room room = new Room(101);

        hospital.addDoctor(doctor);
        hospital.addPatient(patient);
        hospital.addRoom(room);

        doctor.treatPatient(patient, treatment);

        Appointment appointment = new Appointment(patient, doctor, LocalDate.now());
        appointment.printDetails();

        room.assignPatient(patient);
    }
}
