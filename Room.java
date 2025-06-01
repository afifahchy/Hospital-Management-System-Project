public class Room {
    private int roomNumber;
    private boolean isOccupied;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isOccupied = false;
    }

    public void assignPatient(Patient patient) {
        if (!isOccupied) {
            isOccupied = true;
            System.out.println("Assigned patient " + patient.getName() + " to room " + roomNumber);
        } else {
            System.out.println("Room " + roomNumber + " is already occupied.");
        }
    }

    public void vacateRoom() {
        isOccupied = false;
    }
}

