package PetNameProject;
//Naming variables
public class Holiday {
	private String nameOfHoliday;
	private String monthOfHoliday;
	private String dayOfWeekHoliday;
	private String seasonOfHoliday;
	
	public Holiday() {
		nameOfHoliday = "";
		monthOfHoliday = "";
		dayOfWeekHoliday = "";
		seasonOfHoliday = "";
	}
	public Holiday(String nameOfHoliday, String monthOfHoliday, String dayOfWeekHoliday,
			String seasonOfHoliday) {
		this.nameOfHoliday = nameOfHoliday;
		this.monthOfHoliday = monthOfHoliday;
		this.dayOfWeekHoliday = dayOfWeekHoliday;
		this.seasonOfHoliday = seasonOfHoliday;
	}
	//Get method
	public String getNameOfHoliday() {
		return nameOfHoliday;
	}
	public String getMonthOfHoliday() {
		return monthOfHoliday;
	}
	public String getDayOfWeekHoliday() {
		return dayOfWeekHoliday;
	}
	public String getSeasonOfHoliday() {
		return seasonOfHoliday;
	}
	//Set Method
	public void setNameOfHoliday(String nameOfHoliday) {
		this.nameOfHoliday = nameOfHoliday;
	}
	public void setMonthOfHoliday(String monthOfHoliday) {
		this.monthOfHoliday = monthOfHoliday;
	}
	public void setDayOfWeekHoliday(String dayOfWeekHoliday) {
		this.dayOfWeekHoliday = dayOfWeekHoliday;
	}
	public void setSeasonOfHoliday(String seasonOfHoliday) {
		this.seasonOfHoliday = seasonOfHoliday;
	}
}
