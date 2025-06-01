import java.time.LocalDate;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private LocalDate date;

    public Appointment(Patient patient, Doctor doctor, LocalDate date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public void printDetails() {
        System.out.println("Appointment: " + patient.getName() + " with Dr. " + doctor.getName() + " on " + date);
    }
}
