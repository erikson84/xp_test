package com.xp.test;

import java.util.List;
import io.cucumber.java.After;
import io.cucumber.java.pt.*;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestConfig {
  private final WebDriver driver = new ChromeDriver();

  @Dado("que estou na página dos indicadores de uma ação")
  public void estou_na_pagina() {
    driver.get("https://stock-service-doj0.onrender.com/");
  }

  @Quando("inserir a sigla {string} no campo correto")
  public void inserir_sigla_acao(String sigla) {
    driver.findElement(By.id("id_nome")).sendKeys(sigla);
  }

  @E("inserir a data inicial {string}")
  public void inserir_data_inicial(String data_inicial) {
    driver.findElement(By.id("id_data_inicial")).sendKeys(data_inicial);
  }

  @E("inserir a data final {string}")
  public void inserir_data_final(String data_final) {
    driver.findElement(By.id("id_data_final")).sendKeys(data_final);
  }

  @E("clico no botão submeter")
  public void clicar_bota() {
    driver.findElement(By.name("acao")).click();
  }

  @Então("os indicadores de volatilidade, retorno médio e VaR devem aparecer na tela.")
  public void verificar_indicadores() {
    List<WebElement> indicadores = driver.findElements(By.cssSelector("col-1"));
    assertTrue(indicadores.get(0).getText() == "Retorno médio");

  }

  @After
  public void fecha_broser() {
    driver.quit();
  }
}
