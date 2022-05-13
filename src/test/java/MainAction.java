import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainAction {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://бюджет-семьи.рф/kalorijnost-produktov-tablicza-excel");
        driver.findElement(By.linkText("Скачать таблицу калорийности продуктов в Excel")).click();
    }
}
