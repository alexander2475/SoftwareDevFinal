public class settings {

	private static settings single_instance = null;

	private boolean darkMode;

	private settings(){
		this.darkMode = false;
	}

	boolean getDarkMode(){
		return this.darkMode;
	}

	void setDarkMode(boolean flag){
		this.darkMode = flag;
	}

	public static synchronized settings getInstance(){
		if  (single_instance == null){
			return single_instance = new settings();
		}

		return single_instance;
	}

	public void printSettings(){
		System.out.println("Darkmode: " + (getDarkMode()));
	}

}