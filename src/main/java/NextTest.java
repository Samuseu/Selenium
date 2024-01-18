import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;

public class NextTest {
    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(10));

        driver.navigate().to("https://next.privat24.ua/money-transfer/card?lang=en");

        WebElement addCommantLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".commentToggler_Jy6hnlSrFB")));
        addCommantLink.click();

        WebElement commandField = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-qa-node='comment']")));
        commandField.sendKeys("10");

        WebElement closeElements = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[title='Close']")));
        closeElements.click();

        Assertions.assertTrue(wait.until(ExpectedConditions.stalenessOf(commandField)));
    }
}
