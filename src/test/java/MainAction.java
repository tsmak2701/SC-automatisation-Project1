import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class MainAction {

    public static void main(String[] args) throws InterruptedException {
        File file = new File("C:\\Users\\tsmak\\Downloads\\Таблица калорийности продуктов.xls");
        Utils.deleteFile(file);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://бюджет-семьи.рф/kalorijnost-produktov-tablicza-excel");
        driver.findElement(By.linkText("Скачать таблицу калорийности продуктов в Excel")).click();
        Thread.sleep(3000);
        System.out.println(Utils.isFileExist(file));
    }
}
