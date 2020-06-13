package city;

import java.util.HashSet;

import building.Building;

public class Gwanggyo extends City{

	public HashSet<Building> list_Building;
	
	public Gwanggyo() {
		list_Building = new HashSet<Building>();
	}
	
	public HashSet<Building> getBuildingList(){
		return list_Building;
	}
	
	public void add_Building(Building building) {
		list_Building.add(building);
	}
}
