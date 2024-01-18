package common;

public class Config {
    /**
     * Specify the browser and platform for test:
     * CHROME_MAC
     * CHROME_WINDOWS
     * MOZILLA_MAC
     * */
    public static final String BROWSER_AND_PLATFORM = "CHROME_WINDOWS";
    /**
     *clean browser cookies after each iteration
     * */
    public static final Boolean CLEAR_COOKIES = true;
    /**
     * To keep the browser open after all scenario test
     * */
    public static final Boolean HOLD_BROWSER_OPEN = false;
}