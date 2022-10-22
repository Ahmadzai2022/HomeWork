package Task4;

public class TestBrowsers {
    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.open();
        chromeDriver.close();
        String title = chromeDriver.getTitle();
        System.out.println(title);
        chromeDriver.getScreenshot();
        chromeDriver.navigate();

        SafariDriver safariDriver=new SafariDriver();
        safariDriver.open();
        safariDriver.close();
        safariDriver.getScreenshot();
        String title2 = safariDriver.getTitle();
        System.out.println(title2);
        safariDriver.navigate();

        FirefoxDriver firefoxDriver=new FirefoxDriver();
        firefoxDriver.open();
        firefoxDriver.close();
        firefoxDriver.getScreenshot();
        String title3 = firefoxDriver.getTitle();
        System.out.println(title3);
        safariDriver.navigate();

    }
}
