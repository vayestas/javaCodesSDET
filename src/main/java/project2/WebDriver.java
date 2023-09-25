package project2;

public interface WebDriver {
    void open();
    void close();
    String getTitle(String title);
}
interface RemoteWebDriver{
    void navigate();
    String getTitle(String title);
}
interface TakeScreenshot{
    void getScreenshot();
}
class ChromeDriver implements WebDriver,RemoteWebDriver,TakeScreenshot{

    @Override
    public void open() {
        System.out.println("Opens Chrome Driver");
    }

    @Override
    public void close() {
        System.out.println("Closes Chrome Driver");
    }

    @Override
    public void navigate() {
        System.out.println("Chrome driver can navigate from page to page");
    }

    @Override
    public String getTitle(String title) {
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome driver can take screenshots");
    }
}
class FireFoxDrive implements WebDriver,RemoteWebDriver,TakeScreenshot{

    @Override
    public void open() {
        System.out.println("Open FireFox Driver");
    }

    @Override
    public void close() {
        System.out.println("Close FireFox Driver");
    }

    @Override
    public void navigate() {
        System.out.println("FireFox Driver can navigate from website to website");
    }

    @Override
    public String getTitle(String title) {
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox cannot take screenshot");
    }
}
class SafariDriver implements WebDriver,RemoteWebDriver,TakeScreenshot{

    @Override
    public void open() {
        System.out.println("Open Safari Driver");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Driver");
    }

    @Override
    public void navigate() {
        System.out.println("Safari Driver can navigate from website to website");
    }

    @Override
    public String getTitle(String title) {
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari Driver can take screenshot");
    }
    public static void main(String[] args) {
        WebDriver[] arr={new ChromeDriver(),new FireFoxDrive(),new SafariDriver()};
        for(WebDriver d:arr){
            d.open();
            d.close();
            d.getTitle("Amazon.com");
        }
    }
}



