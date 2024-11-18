public class ParkingLotDemo {
    public static void main(String[] args) {
        //testing 
    int nFloors=4;
    int nSlotsPerFloor=6;
    //This creates a parking lot with 4 floors and 6 slots per floor, for a total of 24 slots.
    ParkingLot parkingLot = new ParkingLot("PR1234", nFloors, nSlotsPerFloor);

    parkingLot.getNoOfOpenSlots("car");

    String ticket1 = parkingLot.parkVehicle("car", "MH-03", "red");
    String ticket2 = parkingLot.parkVehicle("car", "MH-04", "purple");

    parkingLot.displayOccupiedSlots("car");
    parkingLot.displayOpenSlots("truck");
    parkingLot.parkVehicle("truck", "MH-01", "black");
    parkingLot.displayOccupiedSlots("truck");
    }
}
