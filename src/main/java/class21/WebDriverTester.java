package class21;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] arr={new ChromeDriver(),new FireFox()};
        for(WebDriver d:arr){
            d.openBrowser();
            d.loadURL("Amazon.com");
            d.performTesting();
            d.close();
        }
    }
}
