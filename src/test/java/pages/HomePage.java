package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage{

    @AndroidFindBy(accessibility = "Open navigation drawer")
    private MobileElement menuBar;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc='Category icon'])[1]")
    private MobileElement star;

    public void clickMenu(){
        this.menuBar.click();
    }

    public boolean navigationDrawerDisplayed(){
        return  this.star.isDisplayed();
    }
}
