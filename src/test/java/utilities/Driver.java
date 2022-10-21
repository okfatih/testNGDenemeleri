package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

   /*
   Testlerimizi çalıştırdığımızda her seferinde yeni driver
   oluşturduğu için her test methodu için yeni driver bir pencere
   açıyor.
   Eğer drivera bir değer atanmamışsa yani driver  == null ise
   bir kere driver'ı çalıştır, diyerek bir kere if içini çalıştıracaktır
   Ve driver artık bir kere çalıştığı için ve değer atandığı için null
   olmayacak ve direkt return edecek ve diğer  testlerimiz aynı pencere
   üzerinde çalışacaktır
    */
   private Driver(){  //Driver classı başka classlardan obje oluşturularak kullanılmasın diye
                     // private bir constructor oluşturduk

   }
   static WebDriver driver;
    public static WebDriver getDriver() {
        /*
        Eğer if atmasak bir test sayfasında 3 web sitesi çalıştırdığımızda
        her bir web sitesi için yeniden driver = new ChromeDriver()
        diyeceğinden 3 darklı pencere açılacak, fakat biz yeni pencere
        açılmasını sadece driver null olduğumu durumda istersek testimiz çalışmaya
        başladığında driver null olacağından ilk pencere ancılır, ikinci kez çalıştığında
        driver null olmadığından açılan pencereden diğer siteye gitmeye devam eder
         */
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

            return driver;
        }
        public static void closeDriver() {
            if (driver != null) {
                driver.close();
                driver=null;
            }
        }
        public static void quitDriver(){
        if (driver!=null){ //Driver a bir değer atanmışsa kapat
            driver.quit();
            driver=null; //Driver ı kapattın sonra testte yeni bir site açılacaksa driverın tekrar null olması lazım
        }

        }

    }
