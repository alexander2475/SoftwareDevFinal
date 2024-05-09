/**
 * The {@code settings} class implements the Singleton design pattern to manage application settings.
 * This class primarily manages the dark mode setting for an application, ensuring that only one
 * instance of the settings can exist throughout the application runtime.
 */
public class settings {

    /**
     * The single instance of {@code settings} that exists throughout the application.
     */
    private static settings single_instance = null;

    /**
     * Flag indicating whether dark mode is enabled.
     */
    private boolean darkMode;

    /**
     * Private constructor to prevent instantiation from outside the class.
     * Initializes the {@code darkMode} flag to {@code false}.
     */
    private settings() {
        this.darkMode = false;
    }

    /**
     * Returns the current status of dark mode.
     *
     * @return {@code true} if dark mode is enabled, {@code false} otherwise.
     */
    boolean getDarkMode() {
        return this.darkMode;
    }

    /**
     * Sets the dark mode status.
     *
     * @param flag the dark mode status to set. {@code true} enables dark mode, {@code false} disables it.
     */
    void setDarkMode(boolean flag) {
        this.darkMode = flag;
    }

    /**
     * Provides access to the singleton instance of the {@code settings} class.
     * If no instance exists, a new one is created. This method is synchronized to prevent
     * multiple threads from creating multiple instances in a multi-threaded environment.
     *
     * @return the single instance of {@code settings}.
     */
    public static synchronized settings getInstance() {
        if (single_instance == null) {
            single_instance = new settings();
        }
        return single_instance;
    }

    /**
     * Prints the current settings to the standard output.
     * Currently, this method prints the status of dark mode.
     */
    public void printSettings() {
        System.out.println("Darkmode: " + (getDarkMode()));
    }

}
