public abstract class Staff extends Person {
    protected String staffId;

    public Staff(String name, int age, String gender, String staffId) {
        super(name, age, gender);
        this.staffId = staffId;
    }

    public String getStaffId() {
        return staffId;
    }
}

