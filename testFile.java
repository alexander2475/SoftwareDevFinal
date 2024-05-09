public class testFile {
	
	public static void main(String[] args) {

		System.out.println("");
		
		// making two objects
		settings test = settings.getInstance();
		test.printSettings();

		settings test1 = settings.getInstance();
		test1.printSettings();

		// Setting for just one of the objects
		test.setDarkMode(true);

		// printing settings for both. Both should now say true as it is same instance for both.
		System.out.println("");
		test.printSettings();
		test1.printSettings();
	}
}
