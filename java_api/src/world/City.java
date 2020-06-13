package world;

public class City extends Country{
	
	public static String name = "";
	public static int population;
	public static String president = "";
	
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		City.name = name;
	}
	public static int getPopulation() {
		return population;
	}
	public static void setPopulation(int population) {
		City.population = population;
	}
	public static String getPresident() {
		return president;
	}
	public static void setPresident(String president) {
		City.president = president;
	}
	
	
	
}
