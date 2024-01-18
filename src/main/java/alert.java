import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
    @Test
    public void allertTests() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://learn.javascript.ru/alert-prompt-confirm");

        //alert
        WebElement alertRun = driver.findElement(By.cssSelector("#joqbfenybb .toolbar__button_run"));
        alertRun.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        alertRun.click();
        System.out.println("text from the alert->" + alert.getText());
        alert.accept();

        //confirm
        WebElement confirmRun = driver.findElement(By.cssSelector("#jguejvkbs1 .toolbar__button_run"));
        confirmRun.click();

        Alert confirm = driver.switchTo().alert();
        confirm.dismiss();
        confirm.accept();

        //promt
        WebElement promtRun = driver.findElement(By.cssSelector("#vfdsq5btcb .toolbar__button_run"));
        promtRun.click();

        Alert promt = driver.switchTo().alert();
        promt.sendKeys("10");
        promt.accept();
        promt.accept();
        driver.quit();
    }
}
