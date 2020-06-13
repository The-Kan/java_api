package building;

import city.City;

public class Building {
	public String name = "";
	public int building_Use = 0;
	public City city = null;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBuilding_Use() {
		return building_Use;
	}
	public void setBuilding_Use(int building_Use) {
		this.building_Use = building_Use;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
	
}
