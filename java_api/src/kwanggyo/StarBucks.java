package kwanggyo;

public class StarBucks extends Building{
	
	public static final int use_building = Use.CAFE;
	public static final String name = "StarBucks";
	public static boolean reserve_StarBucks = true;
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public int getUse_building() {
		// TODO Auto-generated method stub
		return this.use_building;
	}
	
	public void setReserve(boolean reserve_boolean) {
		this.reserve_StarBucks = reserve_boolean;
	}
	
	public boolean isReserve() {
		return this.reserve_StarBucks;
	}
	
	
	
	
	
	

}
