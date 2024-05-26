
package AUTOMATION1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GET_SET_ID {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver =new EdgeDriver();


         //  1-login function to The internet   website   send key,Is displayed,enabled  :

       /* driver.get("https://www.google.com/");
        WebElement SER = driver.findElement(By.xpath("//input[@data-ved=\'0ahUKEwixx8HQ_aWEAxW2XUEAHXCiCoAQ4dUDCBE\']"));  // id
     SER.click();
      SER .isDisplayed();
        boolean  is_displayed= SER.isDisplayed();

        */

        driver.get("https://the-internet.herokuapp.com/login");
        WebElement User_name = driver.findElement(By.name("username"));  // id
          User_name .isDisplayed();
          boolean  is_displayed= User_name.isDisplayed();
          User_name.isEnabled();
          boolean is_enabled =User_name.isEnabled();
        System.out.println(is_displayed);
        System.out.println(is_enabled);
        User_name.sendKeys("tomsmith");
        WebElement Pass = driver.findElement(By.name("password"));  // id
        Pass.sendKeys("SuperSecretPassword!");
        WebElement Login = driver.findElement(By.className("radius"));  // class
        Login.click();
        driver.navigate().back();





//2-Select by index  ** move   to element  **select by option  **Right click**
        driver.get("https://the-internet.herokuapp.com/");
        WebElement Drop_down =driver.findElement(By.xpath("//a[@href='/dropdown']"));
       Drop_down.click();
        WebElement Drop_down_list =driver.findElement(By.xpath("//select[@id='dropdown']"));
       Drop_down_list.click();
        Select Select=new Select(Drop_down_list);//SELECT BY INDEX
        Select.selectByIndex(2);
        driver.navigate().back();
       Select.deselectByVisibleText("Option2"); // by option
        driver.navigate().back();

        WebElement CONTEXT =driver.findElement(By.xpath("//a[@href='/context_menu']"));
       CONTEXT.click();
       WebElement Rightclick =driver.findElement(By.id("hot-spot"));
        Actions actions=new Actions(driver);
       actions.contextClick(Rightclick).perform();//Right  click
        driver.navigate().back();


        WebElement Movetoelement =driver.findElement(By.xpath("//a[@href='/disappearing_elements']"));
        Movetoelement.click();
        WebElement Perform =driver.findElement(By.xpath("//a[@href='/']"));
        Actions  action2 =new Actions(driver);
        action2.moveToElement(Perform).perform();//Right  click
        driver.navigate().back();






        WebElement partial_link_text= driver.findElement(By.partialLinkText("Testing"));   // locate  by  partial link Text
        partial_link_text.click();
        driver.navigate().back();



          WebElement X_path = driver.findElement(By.xpath("//a[@href='/abtest']")); //  Locate  by x_path
          X_path.click();
        driver.navigate().back();

         WebElement ID = driver.findElement(By.id("page-footer"));  // locate  By Id , The internet
         ID.click();
         driver.navigate().back();

        WebElement CSS = driver.findElement(By.cssSelector("#page-footer"));// Locate By CSS The internet
        CSS.click();
        driver.navigate().back();


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        driver.get("https://the-internet.herokuapp.com/");

        WebElement link_text= driver.findElement(By.linkText("A/B Testing"));  // locate By link Text
        link_text.click();
        driver.navigate().back();

        WebElement partial_link_text2= driver.findElement(By.partialLinkText("Testing"));   // locate  by  partial link Text
        partial_link_text2.click();


        driver.navigate().back();


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                             // Dukdukgo.

        /*driver.get("https://duckduckgo.com/?q=panda&atb=v414-3gl&ia=web");
        WebElement search = driver.findElement(By.name("q"));   //  locate by name
        search.sendKeys("Panda");
        WebElement search_tool= driver.findElement(By.id("Search")); // locate by Id
        search_tool.click();


        WebElement css2 = driver.findElement(By.cssSelector("li[class=\"zcm__item\"]:nth-child(1)"));              // by css   and   child locators
        css2.click();

         */

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////














    }





}
