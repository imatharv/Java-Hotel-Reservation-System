package hotelReservationSystem;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class HotelReservationSystemTest {
	@Test
	public void testHoteInfo_shouldReturnTrue(){
		String hotelName = "Ridgewood";
		int RegularRateWeekdays = 120;
		int RegularRateWeekends = 100;
		boolean isValidFirstName = HotelReservationSystem.isValidHotelDetails(hotelName,RegularRateWeekdays,RegularRateWeekends);
		assertTrue(isValidFirstName);
	}
}
