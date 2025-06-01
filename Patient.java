public class Patient extends Person {
    private String patientId;
    private Treatment treatment;

    public Patient(String name, int age, String gender, String patientId) {
        super(name, age, gender);
        this.patientId = patientId;
    }

    public void assignTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public String getPatientId() {
        return patientId;
    }
}
