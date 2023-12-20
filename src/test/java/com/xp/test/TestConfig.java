package com.xp.test;

import io.cucumber.java.pt.*;
import static org.junit.*
import org.junit.Test;
import org.openqa.selenium.*;

public class TestConfig {
  private WebDriver driver;

 @BeforeEach
 public void setUp() {

System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
 ChromeOptions options = new ChromeOptions();
 options.addArguments("--remote-allow-origins=*");
 driver = new ChromeDriver(options);
 }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }@Dado("que estou na página dos indicadores de uma ação")

}
