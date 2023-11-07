package facadePattern;

public class HouseKeeping implements HotelService{

    private int roomNumber;

    public HouseKeeping (int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void cleanRoom (int roomNumber) {
        System.out.println("\n\nHOUSE KEEPING SERVICES");
        System.out.println("Your room number is " + roomNumber + ". Your environment is our first priority. We are happy to clean it for you!");
    }

    @Override
    public void hotelCommonInterface() {
        cleanRoom(roomNumber);
    }
}
