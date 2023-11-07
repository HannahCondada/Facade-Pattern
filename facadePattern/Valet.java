package facadePattern;

public class Valet implements HotelService {
    private String plateNumber;

    public Valet (String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("\n\nVALET PARKING SERVICES");
        System.out.println("Your vehicle plate number is " + plateNumber + " We are here to assist you.");
    }
    @Override
    public void hotelCommonInterface() {
        pickUpVehicle(plateNumber);
    }
}
