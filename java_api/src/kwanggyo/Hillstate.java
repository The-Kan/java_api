package kwanggyo;

public class Hillstate extends Building{

	public static final int use_building = Use.APARTMENT;
	public static final String name = "Hillstate";
	public int population = 0;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public int getUse_building() {
		// TODO Auto-generated method stub
		return use_building;
	}

	
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	
}
