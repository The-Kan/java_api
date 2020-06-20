package doit;

import java.util.Iterator;

import building.Building;
import building.BuildingUse;
import building.Galleria;
import building.HillState;
import building.Hyosung;
import city.Gwanggyo;
import country.Country;
import country.Korea;
import lake.GwanggyoLake;
import lake.Lake;
import util.TimeUtil;
import world.World;

public class Doit {
	
	public static void main(String[] args) {
		Gwanggyo gwanggyo = new Gwanggyo();
	
		// Gwanggyo Init
		initGwanggyo(gwanggyo);

		// get Information of Gwanggyo 
		getGwanggyo(gwanggyo);
		getWorldofGwanggyo(gwanggyo);
		getCountryofGwanggyo(gwanggyo);
		getBuildingListofGwanggyo(gwanggyo);
		getLakeListofGwanggyo(gwanggyo);

	}

	private static void getGwanggyo(Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
		System.out.println("----------- Gwanggyo ------------");
		System.out.println("President of Gwanggyo : " + gwanggyo.getMayor());
		System.out.println("Total Population : " + gwanggyo.getPopulation());
		System.out.println("Province of Gwanggyo : " + gwanggyo.getProvince());
		System.out.println("---------------------------------");
		System.out.println();
	}

	private static void initGwanggyoLake(GwanggyoLake gwanggyoLake, Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
		
		gwanggyoLake.setName("Gwanggyo Lake");
		gwanggyoLake.setPeakTime(22);
		gwanggyoLake.setCity(gwanggyo);

	}

	private static void getLakeListofGwanggyo(Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
		Iterator<Lake> iterator = gwanggyo.getLakeList().iterator();

		System.out.println("------------- Lakes -------------");
		while (iterator.hasNext()) {
			Lake lake = iterator.next();
			System.out.println("Name of Lake : " + lake.getName());
			System.out.println("PeakTime : " + makePeakTimeString(lake.getPeakTime()));
			System.out.println("City : " + lake.getCity().getName());
		}
		System.out.println("---------------------------------");

	}

	private static String makePeakTimeString(int peakTime) {
		// TODO Auto-generated method stub
		String peakTimeStr = "";
		if(peakTime == 24) peakTime = 0;
		if(peakTime >= 0 && peakTime < 12) peakTimeStr = peakTime + TimeUtil.AM;
		else if(peakTime >= 12 && peakTime < 24) peakTimeStr = peakTime + TimeUtil.PM;
		return peakTimeStr;
	}

	private static void getBuildingListofGwanggyo(Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		HashSet<Building> set = gwanggyo.getBuildingList();
		
		Iterator<Building> ite = set.iterator();
				
		
		System.out.println("----------- Buildings -----------");
		int size = set.size();
		for (int i = 0; i < size; i++) {

			Building building = ite.next();
			System.out.println(building.getName());
			System.out.println(building.getBuilding_Use());
			System.out.println();
=======
		Iterator<Building> iterator = gwanggyo.getBuildingList().iterator();

		System.out.println("----------- Buildings -----------");
		while (iterator.hasNext()) {
			Building building = iterator.next();
			System.out.println("Name of Building : " + building.getName());
			System.out.println("Use of building : " + building.getBuilding_Use());
			System.out.println("City : " + building.getCity().getName());
			System.out.println("");
>>>>>>> b1ed8ae7d1bc9fe44e5710348263089cf6812948
		}

		System.out.println("---------------------------------");
		System.out.println("");

	}

	private static void getWorldofGwanggyo(Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
		World world = gwanggyo.getCountry().getWorld();
<<<<<<< HEAD
//		System.out.println("----------- World -----------");
		System.out.println("�꽭怨� 理쒓컯援�  = " + world.getBest_Country());
		System.out.println("�슦由щ뒗 紐⑤몢 " + world.getPlanet() + "�뿉 �엳�뒿�땲�떎");
		System.out.println("�꽭怨� 珥� �씤援ъ닔 = " + world.getPopulation());
=======
		System.out.println("----------- World -----------");
		System.out.println("1st Country  = " + world.getBest_Country());
		System.out.println("We are in " + world.getPlanet());
		System.out.println("Total Population = " + world.getPopulation());
>>>>>>> b1ed8ae7d1bc9fe44e5710348263089cf6812948
		System.out.println("-----------------------------");
		System.out.println("");
	}

	private static void getCountryofGwanggyo(Gwanggyo gwanggyo) {
		// TODO Auto-generated method stub
		Country country = gwanggyo.getCountry();
		System.out.println("----------- Country -----------");
<<<<<<< HEAD
		System.out.println("�굹�씪�쓽 �씠由�  = " + country.getName());
		System.out.println("�굹�씪�쓽 �닔�룄 = " + country.getCapital());
		System.out.println("���넻�졊 = " + country.getPresident());
=======
		System.out.println("Name of Country  = " + country.getName());
		System.out.println("Capital of Country = " + country.getCapital());
		System.out.println("president of Country = " + country.getPresident());
>>>>>>> b1ed8ae7d1bc9fe44e5710348263089cf6812948
		System.out.println("-----------------------------");
		System.out.println("");
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
		
		Korea korea = new Korea();
		World world = new World();
		
		
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

		GwanggyoLake gwanggyoLake = new GwanggyoLake();
		initGwanggyoLake(gwanggyoLake, gwanggyo);

		gwanggyo.add_Lake(gwanggyoLake);

		
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
