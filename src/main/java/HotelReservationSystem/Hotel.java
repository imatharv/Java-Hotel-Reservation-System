package hotelReservationSystem;

public class Hotel {
	public String hotelName;
	private int regularRateWeekDay;
	private int regularRateWeekend;
    
    public Hotel(String hotelName, int regularRateWeekDay, int regularRateWeekend) {
        this.hotelName = hotelName;
        this.regularRateWeekDay = regularRateWeekDay;
        this.regularRateWeekend = regularRateWeekend;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    
    public int getRegularRateWeekDay() {
        return this.regularRateWeekDay;
    }

    public void setRegularRateWeekDay(int regularRateWeekDay) {
        this.regularRateWeekDay = regularRateWeekDay;
    }
    
    public int getRegularRateWeekend() {
        return this.regularRateWeekend;
    }

    public void setRegularRateWeekend(int regularRateWeekend) {
        this.regularRateWeekend = regularRateWeekend;
    }
}
