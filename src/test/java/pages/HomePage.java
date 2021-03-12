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

    @AndroidFindBy(id = "img_switch")
    private MobileElement interchangeBtn;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[3]")
    private MobileElement unitChangeIcon;

    public void changeUnitType(String type){
        unitChangeIcon.click();
        selectConversionType(type);

    }
    public void clickMenu(){
        menuBar.click();
    }
    public void clickInterchange(){
        interchangeBtn.click();
    }

    public boolean navigationDrawerDisplayed(){
        return  star.isDisplayed();
    }

    public void enterValue(String value){
        String[] values = value.split("");
        for(int i=0; i<value.length(); i++){
            driver.findElement(By.xpath("//android.widget.Button[@text='"+values[i]+"']")).click();
        }
    }

    public String getResult(){
        return result.getText();
    }

    public void selectConversionType(String type){
        patientlyScrollMobile("text",type,5);
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+type+"']")).click();
    }
    public boolean isTypeSelected(String type){
        return driver.findElement(By.xpath("//android.widget.TextView[@text='"+type+"']")).isDisplayed();
    }
}
