package class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chrome=new ChromeDriver();
        chrome.navigate().to("https://facebook.com"); // will open page
        System.out.println(chrome.getTitle()); // will show Facebook - log in or sign up
        Thread.sleep(5000); // will wait 5 seconds before closing page
        //chrome.close(); // will close page
        chrome.navigate().to("https://amazon.com");
        Thread.sleep(5000);
        chrome.navigate().refresh();
        Thread.sleep(3000);
        chrome.navigate().back();
        Thread.sleep(3000);
        chrome.close();

    }
}
