package co.com.choucair.certification.proyectoretoauto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage  extends Object{
    public static final Target INPUT_NAME = Target.the("Enter name").located(By.xpath("//*[contains(@name,'firstName')]"));
    public static final Target INPUT_LASTNAME = Target.the("Enter lastname").located(By.xpath("//*[contains(@name,'lastName')]"));

    public static final Target INPUT_ADDREESS = Target.the("Enter address").located(By.xpath("//*[contains(@name,'email')]"));

    public static final Target SELECT_MONTH = Target.the("Select month").located(By.id("birthMonth"));

    public static final Target SELECT_DAY= Target.the("Select day").located(By.id("birthDay"));

    public static final Target SELECT_YEAR= Target.the("Select year").located(By.id("birthYear"));

    public static final Target INPUT_LENGUAGE = Target.the("Enter langguage").located(By.xpath("//*[contains(@class,'ui-select-search input-xs ng-valid ng-dirty ng-touched ng-not-empty ng-valid-parse')]"));

    public static final Target SELECT_LENGUAGE= Target.the("Select lenguage").located(By.xpath("//*[contains(@class,'ui-select-highlight')]"));

    public static final Target BUTTON_BLUE= Target.the("click button location").located(By.xpath("//*[contains(@class,'btn btn-blue')]"));

    public static final Target SELECT_CITY= Target.the("click city").located(By.xpath("//*[contains(@id,'city')]"));
    public static final Target SELECT_COUNTRT_SPAN= Target.the("click city").located(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle'][2]"));

    public static final Target SELECT_CITY_BOGO=Target.the("click city BOGOTA").located(By.xpath("//span[contains(text(),'Bogotá')]"));
    public static final Target INPUT_POSTAL= Target.the("input postal").located(By.xpath("//*[contains(@name,'zip')]"));

    public static final Target SELECT_DEVICE_SPAN= Target.the("Slect device").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[4]"));

    public static final Target INPUT_DEVICE= Target.the("enter device for write device").located(By.xpath("//*[contains(@class,'form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched')]"));

    public static final Target SELECT_TIPDEVICE= Target.the("Slect device").located(By.xpath("(//*[contains(@class,'ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu')])[4]"));

    public static final Target SELECT_MODEL_SPAN= Target.the("Slect device").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[5]"));

    public static final Target SELECT_OPERATING_SPAN= Target.the("select operating").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[6]"));

    public static final Target INPUT_PASSWORD= Target.the("select operating").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD= Target.the("enter confirm password").located(By.id("confirmPassword"));

    public static final Target SELECT_CHERKMARK= Target.the("check one").located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));

    public static final Target SELECT_CHERKMARKDOS= Target.the("check two").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));

    public static final Target SELECT_CHERKMARKTRES= Target.the("check three").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));

    public static final Target SELECT_CHERKMARKTRESSCROLL= Target.the("sCROLL").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));

    public static final Target SELECT_TITLE= Target.the("Successful registration ").located(By.xpath("//h1[contains(text(),'Welcome to the')]"));

}
