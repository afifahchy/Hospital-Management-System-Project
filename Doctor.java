public class Doctor extends Staff {
    private String specialization;

    public Doctor(String name, int age, String gender, String staffId, String specialization) {
        super(name, age, gender, staffId);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void treatPatient(Patient patient, Treatment treatment) {
        patient.assignTreatment(treatment);
        System.out.println("Doctor " + name + " treated patient " + patient.getName());
    }
}
