public class Treatment {
    private String treatmentId;
    private String description;
    private double cost;

    public Treatment(String treatmentId, String description, double cost) {
        this.treatmentId = treatmentId;
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public String getTreatmentId() {
        return treatmentId;
    }
}

