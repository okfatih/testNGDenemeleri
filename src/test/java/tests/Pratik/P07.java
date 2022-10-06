package tests.Pratik;


import Pages.WebuniversityPage;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P07  {
    @Test (groups = "P07")
    public void test1() {
       Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        WebuniversityPage webuniversityPage = new WebuniversityPage();
        List<String> workList = new ArrayList<>(Arrays.asList("Kavaltıyı hazırla","Bulaşık","Bebekle","Odev","Selenium Calis","Zkkim iç"));

        Actions actions = new Actions(Driver.getDriver());
        for (String w:workList
             ) {
           // webuniversityPage.text.sendKeys(w, Keys.ENTER);
            actions.click(webuniversityPage.text).sendKeys(w,Keys.ENTER).perform();

        }
       List<WebElement> todos = webuniversityPage.streepToDoButtons;
        todos.stream().forEach(t->t.click());

        List<WebElement> delete = webuniversityPage.deleteButtons;
        delete.stream().forEach(t->t.click());
    }

    @Test
    public void test2() throws IOException {
        WebuniversityPage webuniversityPage = new WebuniversityPage();
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
        List<WebElement> todoListesi = Driver.getDriver().findElements(By.xpath("//li"));
         todoListesi.stream().forEach(t-> System.out.println(t.getText()));
        System.out.println(ReusableMethods.getElementsText(todoListesi));
        ReusableMethods.waitFor(5);
        ReusableMethods.getScreenshotWebElement("Liste",webuniversityPage.text);

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