package doit;

import building.BuildingUse;
import building.Galleria;
import building.HillState;
import building.Hyosung;
import city.Gwanggyo;
import country.Country;
import country.Korea;
import world.World;

public class Doit {
	public static void main(String[] args) {
		Gwanggyo gwanggyo = new Gwanggyo();
		Korea korea = new Korea();
		World world = new World();

		initGwanggyo(gwanggyo);
		initKorea(korea);
		initWorld(world);

		korea.setWorld(world);
		gwanggyo.setCountry(korea);

		HillState hillState = new HillState();
		initHillState(hillState, gwanggyo);

		Galleria galleria = new Galleria();
		initGalleria(galleria, gwanggyo);

		Hyosung hyosung = new Hyosung();
		initHyosung(hyosung, gwanggyo);

		gwanggyo.add_Building(hillState);
		gwanggyo.add_Building(galleria);
		gwanggyo.add_Building(hyosung);

		
		
		
		
		
		// gwanggyo init END
		
		getWorldofGwanggyo(gwanggyo);
		getCountryofGwanggyo(gwanggyo);
		getBuildingListofGwanggyo(gwanggyo);

	}

	private static void getBuildingListofGwanggyo(Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
		
	/*	System.out.println("----------- Buildings -----------");
		int size = set.size();
		for (int i = 0; i < size; i++) {

			Building building = iterator.next();
			System.out.println(building.getName());
			System.out.println(building.getBuilding_Use());
			System.out.println();
		}

		System.out.println("---------------------------------");
*/
	}

	private static void getWorldofGwanggyo(Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
		World world = gwanggyo.getCountry().getWorld();
//		System.out.println("----------- World -----------");
		System.out.println("세계 최강국  = " + world.getBest_Country());
		System.out.println("우리는 모두 " + world.getPlanet() + "에 있습니다");
		System.out.println("세계 총 인구수 = " + world.getPopulation());
		System.out.println("-----------------------------");
	}

	private static void getCountryofGwanggyo(Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
		Country country = gwanggyo.getCountry();
		System.out.println("----------- Country -----------");
		System.out.println("나라의 이름  = " + country.getName());
		System.out.println("나라의 수도 = " + country.getCapital());
		System.out.println("대통령 = " + country.getPresident());
		System.out.println("-----------------------------");
	}

	private static void initHyosung(Hyosung hyosung, Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
		hyosung.setBuilding_Use(BuildingUse.OFFICETEL);
		hyosung.setCity(gwanggyo);
		hyosung.setName("Hyosung");
	}

	private static void initGalleria(Galleria galleria, Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
		galleria.setBuilding_Use(BuildingUse.DEPARTMENTSTORE);
		galleria.setCity(gwanggyo);
		galleria.setName("Galleria");

	}

	private static void initHillState(HillState hillState, Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
		hillState.setBuilding_Use(BuildingUse.APARTMENT);
		hillState.setCity(gwanggyo);
		hillState.setName("HillState");

	}

	public static void initGwanggyo(Gwanggyo gwanggyo) {
		gwanggyo.setMayor("DEOK HWAN YUN");
		gwanggyo.setName("Gwanggyo");
		gwanggyo.setPopulation(20000);
		gwanggyo.setProvince("Gyeonggi-do");
		gwanggyo.setYearly_average_income(3000);
	}

	public static void initKorea(Korea korea) {
		korea.setCapital("Seoul");
		korea.setContinent("Asia");
		korea.setName("Korea");
		korea.setPopulation(50000000);
		korea.setPresident("Moon Jae In");
	}

	public static void initWorld(World world) {
		world.setBest_Country("USA");
		world.setPlanet("EARTH");
		world.setPopulation(700000000);
	}

}
