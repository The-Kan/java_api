package lake;

import city.City;

public class Lake {
	
	public String name = "";
	public int peakTime = 0;
	public City city = null;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeakTime() {
		return peakTime;
	}
	public void setPeakTime(int peakTime) {
		this.peakTime = peakTime;
	}
	
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
}
