package country;

public class Korea extends Country {

	public static final String FRONT_NEW_NAME = "NICE";

	public String getNewName() {
		String new_Name = FRONT_NEW_NAME + name;
		return new_Name;
	}

}
