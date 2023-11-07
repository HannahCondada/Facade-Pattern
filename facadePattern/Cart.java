package facadePattern;

public class Cart implements HotelService{
    private int numberOfCarts;

    public Cart (int numberOfCarts){
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("\n\nCART SERVICES");
        System.out.println("Numbers of cart you requested is " + numberOfCarts + ". We are happy to assist you with your luggages!");
    }

    @Override
    public void hotelCommonInterface() {
        requestCart(numberOfCarts);
    }
}
