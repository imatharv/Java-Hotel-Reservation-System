package hotelReservationSystem;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelReservationSystem {
	
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    public void addHotel(String hotelName, int regularRateWeekDay, int regularRateWeekend){
        Hotel hotelObj = new Hotel(hotelName, regularRateWeekDay, regularRateWeekend);
        hotelList.add(hotelObj);
    }
    
    public static boolean isValidHotelDetails(String hotelName, int regularRateWeekdays, int regularRateWeekends) {
    	HotelReservationSystem object = new HotelReservationSystem();
    	int check = 1;
    	while(check!=0) {
    		object.addHotel(hotelName, regularRateWeekdays, regularRateWeekends);
    		check = 0;
    		return true;
    	}
    	return false;
	}
	
    public void displayOptions() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int flag = 0;
        while(flag == 0) {
            System.out.println("Select from the following options:");
            System.out.println("1 for add new hotel details");
            System.out.println("2 for view hotels");
            System.out.println("3 for view exit");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter hotel name: ");
                    String var1 = scanner.nextLine();
                    System.out.println("Enter regular cutomer rate for week days: ");
                    int var2 = scanner.nextInt();
                    System.out.println("Enter regular cutomer rate for weekends: ");
                    int var3 = scanner.nextInt();
                    
                    addHotel(var1, var2, var3);
                    System.out.println();
                    System.out.println("Information added successfully.\n");
                    
                    break;
                    
                case 2:
                	System.out.println("Avaliable hotels are: ");
                	System.out.println(hotelList);
                    break;
                    
                case 3:
                	flag = 1;
                	break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Welcome to hotel reservation system");
		HotelReservationSystem object = new HotelReservationSystem();
		object.displayOptions();
	}
	
}
