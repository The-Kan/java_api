package city;

import java.util.HashSet;

import building.Building;
import country.Country;
import lake.Lake;

public class City {
	public String name = "";
	public int population = 0;
	public String mayor = "";
	public String province = "";
	public int yearly_average_income = 0;
	public Country country = null;
	public HashSet<Building> list_Building;
	public HashSet<Lake> list_Lakes;
	
	public int getYearly_average_income() {
		return yearly_average_income;
	}

	public void setYearly_average_income(int yearly_average_income) {
		this.yearly_average_income = yearly_average_income;
	}

	public String getMayor() {
		return mayor;
	}

	public void setMayor(String mayor) {
		this.mayor = mayor;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	public HashSet<Building> getBuildingList(){
		return list_Building;
	}
	
	public void add_Building(Building building) {
		list_Building.add(building);
	}
	
	public HashSet<Lake> getLakeList(){
		return list_Lakes;
	}
	
	public void add_Lake(Lake lake) {
		list_Lakes.add(lake);
	}

	
	
}
