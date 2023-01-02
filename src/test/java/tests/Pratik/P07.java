package tests.Pratik;


import Pages.WebuniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBaseRapor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P07 extends TestBaseRapor {

    WebuniversityPage webuniversityPage = new WebuniversityPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test(groups = "P07")
    public void test1() {

        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        List<String> workList = new ArrayList<>(Arrays.asList("Kavaltıyı hazırla", "Bulaşık", "Bebekle", "Odev", "Selenium Calis", "Zkkim iç"));


        for (String w : workList
        ) {
            // webuniversityPage.text.sendKeys(w, Keys.ENTER);
            actions.click(webuniversityPage.text).sendKeys(w, Keys.ENTER).perform();

        }
        List<WebElement> todos = webuniversityPage.streepToDoButtons;
        todos.stream().forEach(t -> t.click());

        List<WebElement> delete = webuniversityPage.deleteButtons;
        delete.stream().forEach(t -> t.click());
    }

    @Test
    public void test3() throws InterruptedException {

        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
        extentTest = extentReports.createTest("Click exercise testi", "User can add activities on TO-DO List");


        extentTest.info("Siteye gidildi");

        extentTest.info("Listeye eklenecek aktiviteler belirlendir");
        List<String> plans = new ArrayList<>(Arrays.asList("Take kids to school", "Get back home", "Grab coffee", "Start your Pc"));

        extentTest.info("Aktiviteler foreach methodu ile tek tek listeye atıldı");
        for (String e : plans
        ) {
            ;
            actions.click(webuniversityPage.text).sendKeys(e, Keys.ENTER).perform();

        }

        extentTest.info("Eklenen aktivitelerin hepsi liste ile yazıdırıldı");
        List<WebElement> createdTodos = webuniversityPage.toDoListelemanlari;
        createdTodos.forEach(t -> System.out.println(t.getText()));


        extentTest.info("Eklenen aktivitelerin üstü Lambda ile çizildi");
        List<WebElement> tobeStreeped = webuniversityPage.streepToDoButtons;
        tobeStreeped.forEach(t -> t.click());

        extentTest.info("Liste elemanları silindi");
        List<WebElement> delete = webuniversityPage.deleteButtons;
        delete.stream().forEach(t -> t.click());
    }

    /*
    Yukarıdaki testten farklı olarak bu testte işlem daha basit
    Siteye gittiğimizde 3 tane todo item var(Go to potion class, Buy new robes, Practice magic), biz yazdığımız otomasyonlar
    bu 3 itemı getText kullanarak yazdırıyoruz
     */
    @Test
    public void test2() throws IOException {
        WebuniversityPage webuniversityPage = new WebuniversityPage();
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
        List<WebElement> todoListesi = Driver.getDriver().findElements(By.xpath("//li"));
        todoListesi.stream().forEach(t -> System.out.println(t.getText()));
        System.out.println(ReusableMethods.getElementsText(todoListesi));
        ReusableMethods.waitFor(5);
        ReusableMethods.getScreenshotWebElement("Liste", webuniversityPage.text);

    }
}
/*
// http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
// Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
//Tüm yapılacakların üzerini çiz.
//Tüm yapılacakları sil.
//Tüm yapılacakların silindiğini doğrulayın.
exploratory testing


Keşif Testi (Exploratory Testing) , test senaryolarının önceden oluşturulmadığı,
testçilerin sistemi test anında kontrol ettiği bir tür yazılım testidir.
Herhangi bir test senaryosuna bağlı kalmaksızın yazılımları serbestçe keşfederek buldukları bug’ları raporlamasına dayanır.
Test uzmanlarının minimum planlama ve maksimum test uygulamasına katıldığı uygulamalı bir yaklaşımdır.
Testin yürütülmesinden önce neyin test edileceğine dair fikirleri not edebilirler.
Keşif Testi (Exploratory Testing), diğer test yaklaşımlarında kolayca kapsanmayan hataları ve eksiklikleri keşfetmeye, ortaya çıkarmaya dayanır.
Özellikle yazılım test döngüsünün başlarında sıkça başvurulan bir test türüdür.
 Test uzmanı açısından ise istediği şekilde son kullanıcı senaryoları oluşturma imkanı olduğu için eğlencelidir.




 */