import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> guestNames = new ArrayList<>();
        ArrayList<String> guestEmail = new ArrayList<>();
        ArrayList<Integer> numberOfGuest = new ArrayList<>();
        ArrayList<String> roomType = new ArrayList<>();
        ArrayList<String> bedTypes = new ArrayList<>();
        ArrayList<Integer> roomNumbers = new ArrayList<>();
        ArrayList<Integer> nights = new ArrayList<>();
        ArrayList<Double> totalCost = new ArrayList<>();

        //Keyboard scanner
        Scanner input = new Scanner(System.in);
        boolean running = true;

        //While loop for the user to select the menu options
        while (running) {
          System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║        HOTEL RESERVATION MENU        ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ 1. Add Reservation                   ║");
            System.out.println("║ 2. Remove Reservation                ║");
            System.out.println("║ 3. View Reservations                 ║");
            System.out.println("║ 4. Quit                              ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("Select an option: ");
            String choice = input.nextLine();

            switch (choice) {
                //When the user chooses 1
                case "1":
                    System.out.print("Guest name: ");
                    String name = input.nextLine();

                    System.out.print("Guest email: ");
                    String email = input.nextLine();

                    System.out.print("Number of Guests staying: ");
                    int numGuests = input.nextInt();
                    input.nextLine(); // clear the newline

                    System.out.print("Room type: ");
                    String type = input.nextLine();

                    System.out.print("Bed type: ");
                    String bedType = input.nextLine();

                    System.out.print("Room Number: ");
                    int roomNum = input.nextInt();

                    System.out.print("Nights staying: ");
                    int stay = input.nextInt();
                    input.nextLine(); // clear the newline

                    //Cost for staying each night
                    double roomRate = 130.0;
                    double pricePerGuest = 50.0;
                    double cost = (roomRate * stay) + (pricePerGuest * stay * numGuests);

                    guestNames.add(name);
                    guestEmail.add(email);
                    numberOfGuest.add(numGuests);
                    roomType.add(type);
                    bedTypes.add(bedType);
                    roomNumbers.add(roomNum);
                    nights.add(stay);
                    totalCost.add(cost);

                    System.out.println("✅ Reservation added successfully!");
                    break;

                //when the user chooses 2 to delete a reservation
                case "2":
                    System.out.print("Enter guest name to delete: ");
                    String deleteName = input.nextLine();
                    int index = guestNames.indexOf(deleteName);
                    if (index != -1)
                    {
                        guestNames.remove(index);
                        guestEmail.remove(index);
                        numberOfGuest.remove(index);
                        roomType.remove(index);
                        bedTypes.remove(index);
                        roomNumbers.remove(index);
                        nights.remove(index);
                        totalCost.remove(index);

                        System.out.println("✅ Reservation Deleted successfully!");
                    }
                    else
                    {
                        System.out.println(" ⚠ Guest name not found!");
                    }
                    break;


                //When the user chooses 3 to view all reservations
                case "3":
                    int guestNum = 1;
                    System.out.println("\n === CURRENT RESERVATION  ===");
                    if (guestNames.isEmpty())
                        System.out.println("⚠ No reservations found.");

                    else

                        for (int i = 0; i < guestNames.size(); i++) {
                            System.out.println("\n --- Guest " + guestNum + "---");
                            System.out.println("Guest Name: " + guestNames.get(i) +
                                    "\nGuest Email: " + guestEmail.get(i) +
                                    "\nNumber of Guests staying: " + numberOfGuest.get(i) +
                                    "\nRoom Type: " + roomType.get(i) +
                                    "\nBed type: " + bedTypes.get(i) +
                                    "\nRoom Number: " + roomNumbers.get(i) +
                                    "\nNights staying: " + nights.get(i) +
                                    "\nTotal Cost: €" + totalCost.get(i) +
                                    "\n");
                            guestNum++;

                        }
                    break;

                //When the user chooses 4 to exit
                case "4":
                    running = false;
                    System.out.println("Exiting system... Goodbye!");
                    break;

                default:
                    System.out.println("⚠ Invalid option, try again.");

            }
        }
    }
}

