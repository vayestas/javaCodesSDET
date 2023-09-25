package class21;

public abstract class WebDriver {
    abstract void openBrowser();
    abstract void loadURL(String url);
    abstract void performTesting();
    abstract void close();
}
class ChromeDriver extends WebDriver{


    @Override
    void openBrowser() {
        System.out.println("Opening the Google Chrome Browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the URL");
    }

    @Override
    void performTesting() {
        System.out.println("Performing Testing");
    }

    @Override
    void close() {
        System.out.println("Closing the Chrome Browser");
    }
}
class FireFox extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opens FireFox Browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading URL");
    }

    @Override
    void performTesting() {
        System.out.println("Performing Testing");
    }

    @Override
    void close() {
        System.out.println("Closing the FireFox Browser");
    }
}