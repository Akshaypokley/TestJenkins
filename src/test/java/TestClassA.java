import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.bind.SchemaOutputResolver;

public class TestClassA {

    WebDriver driver;

    @BeforeClass
    public void beforeclass()
    {
        System.out.println("Before Class Excuting ");
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.google.com");
        String s=driver.getTitle();
        System.out.println(s);
    }

    @BeforeMethod
    public void beforemethod()
    {
        System.out.println("Excuting Before Method");
    }

    @Test
    public void test1()
    {
        String str=driver.getTitle();
        Assert.assertEquals(str,"Google");
    }

    @Test
    public void test2()
    {
        String str=driver.getTitle();
        Assert.assertEquals(str,"Google`1");
    }


    @Test
    public void test()
    {
        String str=driver.getTitle();
        Assert.assertEquals(str,"");
    }

    @AfterClass
    public void afterclass()
    {
        driver.close();
    }


}
