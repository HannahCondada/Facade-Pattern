package facadePattern;

import java.util.*;

public class HotelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MENU();
        String serviceOption = sc.nextLine();

        switch (serviceOption){
            case "1":
                System.out.print("\n\nPlease Enter your plate number: ");
                String plateNumber = sc.nextLine();
                HotelService valet = new Valet(plateNumber);
                FrontDesk frontDesk = new FrontDesk();
                frontDesk.service(valet);
                break;
            case "2":
                System.out.print("\n\nPlease enter your room number: ");
                int roomNumber = sc.nextInt();
                HotelService houseKeeping = new HouseKeeping(roomNumber);
                FrontDesk frontdesk = new FrontDesk();
                frontdesk.service(houseKeeping);
                break;
            case "3":
                System.out.print("\n\nHow many carts do you need?: ");
                int numberOfCarts = sc.nextInt();
                HotelService cart = new Cart(numberOfCarts);
                frontdesk = new FrontDesk();
                frontdesk.service(cart);
                break;
            case "4":
                System.out.println("Thank you for using our services.");
                System.out.println("\n\nProgrammed by: Hannah Condada");
                System.out.println("3 | BSCS1");
            default:
                System.out.println("Invalid number option. Please choose a number within the services menu.");
        }
        main(args);
    }

    public static void MENU() {
        System.out.println("\n\nHOTEL SERVICES");
        System.out.println("1. Valet Parking.");
        System.out.println("2. House Keeping.");
        System.out.println("3. Luggage Cart.");
        System.out.println("4. Exit Services.");
        System.out.print("\n\nWhat service do you need?: ");
    }
}
