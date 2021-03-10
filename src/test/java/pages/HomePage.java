package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class HomePage extends BasePage{

    @AndroidFindBy(accessibility = "Open navigation drawer")
    private MobileElement menuBar;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc='Category icon'])[1]")
    private MobileElement star;

    @AndroidFindBy(id = "target_value")
    private MobileElement result;

    public void clickMenu(){
        menuBar.click();
    }

    public boolean navigationDrawerDisplayed(){
        return  star.isDisplayed();
    }

    public void enterValue(String value){
        driver.findElement(By.xpath("//android.widget.Button[@text='"+value+"']")).click();
    }

    public String getResult(){
        return result.getText();
    }
}
